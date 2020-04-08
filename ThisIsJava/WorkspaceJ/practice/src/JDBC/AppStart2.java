package JDBC;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.util.Properties;
        import java.sql.Statement;
        import java.sql.ResultSet;

public class AppStart2 {
    public static void main(String[] args) {
        Properties prop=new Properties();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        final String url="jdbc:mariadb://localhost:3306/example";
        final String user="example";
        final String pass = "1234";

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("JDBC드라이버가 검색되었습니다.");
            con= DriverManager.getConnection(prop.getProperty("url"),prop.getProperty(user),prop.getProperty(pass));
            System.out.println("데이터베이스 서버와 접속");
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from members");
            while(rs.next()){
                System.out.printf("%s %s\n",rs.getString(2),rs.getString(3));
                //System.out.printf("%s %s\n",rs.getString("member_name"),rs.getString("member_email"));
            }
        }
        catch (ClassNotFoundException e){
            System.err.println("JDBC드라이버 검색에 실패하였습니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{rs.close();}catch (Exception e){}
            try{stmt.close();}catch (Exception e){}
            try{con.close();}catch (Exception e){}
        }
    }
}
