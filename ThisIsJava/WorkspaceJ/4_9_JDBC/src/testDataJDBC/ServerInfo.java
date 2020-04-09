package testDataJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerInfo {
    private static String SERVER="192.168.30.200";
    private static String USER="gyetol";
    private static String PASSWORD="1234";
    private static String DATABASE="gyetol";

    public static void setSERVER(String SERVER) {
        ServerInfo.SERVER = SERVER;
    }

    public static void setUSER(String USER) {
        ServerInfo.USER = USER;
    }

    public static void setPASSWORD(String PASSWORD) {
        ServerInfo.PASSWORD = PASSWORD;
    }

    public static void setDATABASE(String DATABASE) {
        ServerInfo.DATABASE = DATABASE;
    }

    public static String getSERVER() {
        return SERVER;
    }

    public static String getUSER() {
        return USER;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static String getURL(){
        return "jdbc:mariadb://"+SERVER+":3306/"+DATABASE+"?user="+ USER+"&password="+PASSWORD;
        //서버주소:포트번호/데이터베이스?user=계정&password=비번
    }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버가 설치되지 않았습니다.");
            System.exit(1);
        }
        return DriverManager.getConnection(getURL()); // 이안에서 어떻게 할지 정책을 정할 수 없으므로 예외를 던진다.
    }
}
