/*
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AppStart4 {
    public static void main(String[] args) {
        Connection con =null;
        PreparedStatement pstmt=null;
        String url = "jdbc:mariadb://localhost:3306/example";
        String user="example";
        String pass="1234";

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);
            pstmt=con.prepareStatement("insert into members values('jeonka','전경안','Mr반장','ㅇㅇ')");
            pstmt.setString(1,"wonchang");
            pstmt.setString(2,"박원창");
            pstmt.setString(3,"Mr.Park");
            pstmt.setString(4,"1234");
            int result=pstmt.executeUpdate();
            System.out.println("result : "+result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{ pstmt.close();}catch (Exception e){}
            try{con.close();}catch (Exception e){}
        }
    }
}
*/
