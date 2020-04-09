package p1;

import java.sql.*;

public class AppStart {
    public static void main(String[] args) {
        Connection con =null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con= DriverManager.getConnection(ServerInfo.getURL());
            stmt=con.createStatement();
            rs=stmt.executeQuery("select p_code as code,p_name as name from parts"); // select구문 ,show구문실행시 사용, ResultSet 결과를 반환
            //stmt.executeUpdate(sql);// update,delete,insert 구문실행시 영향을 받은 행 반환
            while(rs.next()){
                System.out.printf("%10s %20s\n",rs.getString(1),rs.getString("name"));
                //컬럼인덱스도 가능, 컬럼헤더명도 가능//알리아싱했으면 바뀐이름으로 써야함
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("JDBC 드라이버가 설치되지 않았습니다.");
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try{rs.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try{stmt.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try{con.close();} catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
