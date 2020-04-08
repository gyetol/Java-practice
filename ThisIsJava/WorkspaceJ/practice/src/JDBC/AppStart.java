package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AppStart {
    public static void main(String[] args) {
        Connection con = null;

        // oracle일 경우 url형식이 바뀜
        String url = "jdbc:mariadb://127.0.0.1:3306/gyetol";
        String user = "gyetol";
        String pass = "gyetory";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("JDBC드라이버를 DriverManager에 등록하였습니다.");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("데이터베이스 서버 접속 완료");
        }
        catch (ClassNotFoundException e) {
            System.out.println("JDBC드라이버 검색 실패");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try { con.close(); }
            catch (Exception e) {}
        }
    }
}
