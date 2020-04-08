package JDBC.DAO;

import JDBC.Category;
import JDBC.Comic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ComicDAO {
    public static ArrayList<Comic> getComic(Category category){
        ArrayList<Comic> list =new ArrayList<>();
        Connection con =null;
        Statement stmt=null;
        ResultSet rs=null;
        String url = "jdbc:mariadb://localhost:3306/example";
        String user = "example";
        String pass = "1234";

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            //stmt = con.createStatement("select * from comics where category_code="); prepared statement일때 가능
            stmt = con.createStatement();
            rs =stmt.executeQuery("select * from comics where category_code= ' " + category.getCode() + "'");
            while(rs.next()){
                Comic c=new Comic();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setPrice(rs.getInt("price"));
                c.setCategoryCode(rs.getString("category_code"));
                c.setPublisherCode(rs.getString("publisher_code"));
                c.setCategory(category);
                list.add(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{rs.close();}catch (Exception e){}
            try{stmt.close();}catch(Exception e){}
            try{con.close();}catch(Exception e){}
        }

        return list;
    }
}
