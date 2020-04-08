package JDBC.DAO;

import JDBC.Category;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CategoryDAO {
    public static ArrayList<Category> getCategory(){
        ArrayList<Category> list=new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mariadb://localhost:3306/example";
        String user = "example";
        String pass = "1234";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
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
