package p2;

import java.sql.Connection;
import java.sql.SQLException;

public class AppStart {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con=ServerInfo.getConnection();
            Member member =new Member(0,"hong@naver.com","의적");
            if(MemberDAO.getInstance().registerMember(con,member)){
                System.out.println("아래의 정보로 회원가입이 정상처리 되었습니다.");
                System.out.println("------------------------------------------");
                System.out.println("회원ID : " + member.getId());
                System.out.println("메일주소 : " + member.getEmail());
                System.out.println("닉네임 : " + member.getNick());
            }
            else{
                System.err.println("회원가입에 실패하였습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{con.close();} catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
