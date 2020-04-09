package p2;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
    private static MemberDAO instance = new MemberDAO();
    ArrayList<Member> members;

    private MemberDAO(){}

    public static MemberDAO getInstance(){
        return instance;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public int getLastInsertId(Connection con) throws SQLException{
        Statement stmt = null;
        ResultSet rs=null;
        int id =0;
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery("select LAST_INSERT_ID()"); //다른 sql문 쓰기전에 바로 써라
            if(rs.next()){
                id=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        finally{
            try{rs.close();}catch (Exception e){}
            try{stmt.close();}catch (Exception e){}
        }
            return id;
    }

    public boolean registerMember(Connection con, Member member){
        PreparedStatement pstmt=null;
        boolean result=false;

        try{
            pstmt=con.prepareStatement("insert into members values (default,?,?)");
            pstmt.setString(1,member.getEmail());
            pstmt.setString(2,member.getNick());
            result=(pstmt.executeUpdate()>0);
        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
        finally {
            try{pstmt.close();}catch (Exception e){}
        }

        return result;
    }
}
