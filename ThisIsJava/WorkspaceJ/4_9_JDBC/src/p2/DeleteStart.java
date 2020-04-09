package p2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStart {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;

        try{
            con=ServerInfo.getConnection();
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery("select * from members");


            while(rs.next()){ //조인,서브쿼리,가공되어있는 컬럼은 삭제,수정이 가능은 하지만 값이 터무니 없는것이 들어간다(?)
                if(rs.getString("email").equals("의적")){
                    rs.updateString(2,"gildong@google.co.kr");
                    rs.updateString(3,"홍길동");
                    rs.updateRow();
                    break;
                }
            }


            /*rs.moveToInsertRow();
            rs.updateInt(1,109);
            rs.updateString(2,"hong@naver.com");
            rs.updateString(3,"의적");
            rs.insertRow();
            rs.moveToCurrentRow();*/




        /*    while(rs.next()){
                if(rs.getString("nick").equals("김기희")){
                    System.out.println("id가 "+rs.getInt("id")+"행을 삭제합니다.");
                    rs.deleteRow();
                    break;
                }
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{rs.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try{stmt.close();} catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
