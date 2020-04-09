package JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;


public class AppStart {
    public static final String url="jdbc:mariadb://localhost:3306/example";
    public static final String user="example";
    public static final String pass ="1234";
    public static void main(String[] args) {
        Connection con=null;
        ArrayList<Category> list =null;
        try{
            con= DriverManager.getConnection(url,user,pass);
            con.setAutoCommit(false);

            Category ca = new Category("LECT","학원");
            Comic co = new Comic(0,"테스트입력",20000,"LECT","HUNI",ca);
            if(CategoryDAO.insert(con,ca)){
                if(ComicDAO.insert(con,co)){
                    con.commit();
                    System.out.println("정상적으로 등록되었습니다.");
                }
                else{
                    System.out.println("코믹 등록에 실패하였습니다.");
                }
            }
            else{
                con.rollback();
                System.out.println("카테고리 등록에 실패하였습니다.");

            }
            con.rollback();
            con.setAutoCommit(true);

            if(CategoryDAO.insert(con,ca)){
                System.out.println("정상적으로 등록되었습니다.");
            }
            else{
                System.err.println("자료 등록에 실패하였습니다.");
            }
            list=CategoryDAO.getCategory(con);
            for(int i=0;i<list.size();i++)
            {
                Category category=list.get(i);
                ComicDAO.getComic(con,category);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{con.close();}catch (Exception e){}
        }
    }
}
