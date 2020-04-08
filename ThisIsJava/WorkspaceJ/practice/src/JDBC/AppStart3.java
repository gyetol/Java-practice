package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AppStart3 {
    public static void main(String[] args) {
        Connection con=null;
        String url="jdbc:mariadb://localhost:3306/example";
        Statement stmt=null;

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con= DriverManager.getConnection(url);
            stmt=con.createStatement();
            int result=stmt.executeUpdate("insert into members values('lee','이순신','sunsin@naver.com',left(password('1234'),32))");
            System.out.println("result: "+result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{ stmt.close(); } catch (Exception e){}
            try{con.close();}catch(Exception e){}
        }
    }
}
