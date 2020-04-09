package p1;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InsertStart {

    public static int getNextId(Connection con,String code) throws SQLException{
        int id=0;
        Statement stmt=null;
        ResultSet rs=null;

        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery("select ifnull(max(id),0)+1 as nextid from articles where p_code='" + code+ "';");
            if(rs.next()){
                id=rs.getInt("nextId");
            }
        } catch (SQLException e) {
            System.err.println("articles 테이블의 id를 구하는 도중 문제가 발생");
            e.printStackTrace();
            throw e;
        }
        finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return id;
    }

    public static void main(String[] args) {
        Connection con =null;
        PreparedStatement stmt=null;

        try {
            con=ServerInfo.getConnection();
            stmt=con.prepareStatement("insert into articles values (?,?,?,?,?,?)"); //물음표는 in-parameter라고 부른다 . 그걸 지정을 해줘야 한다
            stmt.setInt(1,getNextId(con,"fishing"));
            stmt.setString(2,"fishing");
            stmt.setString(3,"계토리");
            stmt.setString(4,"마스크는 귀걸이가 아닙니다");
            stmt.setString(5,"여기에 내용을 입력합니다.");
           // stmt.setString(6,default); 이렇게 쓰면 안된다
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String now = sdf.format(Calendar.getInstance().getTime());
            stmt.setString(6,now);
            if(stmt.executeUpdate()>0){
                System.out.println("게시물등록에 성공");
            }
            else{
                throw new Exception("알 수 없는 원인에 의해 게시물 등록에 실패하였습니다");
            }
        } catch (SQLException e) {
            System.err.println("게시글 등록에 실패하엿습니다.");
            e.printStackTrace();
        }
        catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{stmt.close();}catch (Exception e){}
            try{con.close();}catch (Exception e){}
        }


    }
}

