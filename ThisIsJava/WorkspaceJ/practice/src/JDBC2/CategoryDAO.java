package JDBC2;

import JDBC.Category;

import java.sql.*;
import java.util.ArrayList;

public class CategoryDAO {
    public static boolean insert(Connection con,Category category){
        PreparedStatement pstmt=null;
        boolean result=false;

        try{
            pstmt=con.prepareStatement("insert into category values (?,?)");
            pstmt.setString(1,category.getCode());
            pstmt.setString(2,category.getName());
            result=(pstmt.executeUpdate()>0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{pstmt.close();}catch(Exception e){}
        }
        return result;
    }


    public static ArrayList<Category> getCategory(Connection con){
        ArrayList<Category> list=new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;


        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from category");
            while(rs.next()){
                Category c =new Category();
                c.setCode(rs.getString("category_code"));
                c.setName(rs.getString("category_name"));
                list.add(c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{rs.close();}catch (Exception e){}
            try{stmt.close();}catch (Exception e){}
            try{con.close();}catch (Exception e){}
        }
        for(Category category: list){
            System.out.println("----------------------------------");
            System.out.println("분류코드: "+category.getCode());
            System.out.println("분류이름: "+category.getName());
            System.out.println("포함 서적: "+category.getComics());

        }
        return list;
    }
}
