package JDBC.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
    private static MyConnection connection = new MyConnection();
    public final String url= "jdbd:mariadb://localhost:3306/example";
    public final String user="example";
    public final String pass = "1234";

    private MyConnection(){}

    public static MyConnection getInstance(){
        return connection;
    }

    public Connection getConnection() throws Exception{
        return DriverManager.getConnection(url,user,pass);
    }
    public void close(Connection con){
        try{con.close();}catch(Exception e){}
    }
    public void close(Statement stmt){
        try{stmt.close();}catch(Exception e){}
    }
    public void close(ResultSet rs){
        try{rs.close();}catch(Exception e){};
    }
}
