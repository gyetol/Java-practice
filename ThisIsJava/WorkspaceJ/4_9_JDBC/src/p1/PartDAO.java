/*
package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PartDAO {
    private static PartDAO instance;
    private static int UPDATENUM;
    private ArrayList<Part> parts;

    static {
        instance=new PartDAO();
        UPDATENUM=0;
    }

    private PartDAO(){
        this.parts=new ArrayList<Part>();
    }
    private PartDAO(ArrayList<Part> parts){
        this.parts=parts;
    }

    public static PartDAO getInstance(){
        return instance;
    }

    //분류를 등록하는 기능
    public boolean insert(Connection con,Part part){
        PreparedStatement pstmt=null;
        boolean result=false;

        try{
            pstmt=con.prepareStatement("insert into parts values (?,?)");

            pstmt.setString(1,part.getCode());
            pstmt.setString(2,part.getName());
            result=pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(result){
                try {
                    UPDATENUM+=pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }
    public boolean insert(Connection con,String code,String name){
        PreparedStatement pstmt=null;
        boolean result=false;
        try{
            pstmt=con.prepareStatement("insert into parts values (?,?)");
            pstmt.setString(1,code);
            pstmt.setString(2,name);
            result=pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if(result){
                try {
                    UPDATENUM+=pstmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }
    //분류를 편집할 수 있는 기능
    public boolean update(Connection con,Part part){

    }
    public boolean update(Connection con,String code,String name){

    }
    //분류를 검색할 수 있는 기능
    public ArrayList<Part> getPartList(Connection con){
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        int updateNum=UPDATENUM;
        try{
            pstmt=con.prepareStatement("select * from parts limit ");
            rs=pstmt.executeQuery();

            while(rs.next()){
                String code=rs.getString("p_code");
                String name=rs.getString("p_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            UPDATENUM=0;
        }
    }

    public Part getPart(Connection con, Part part){

    }

    public Part getPart(Connection con,String code){

    }

    //분류를 삭제할 수 있는 기능
    public boolean delete(Connection con,Part part){

    }
    public boolean delete(Connection con,String code){

    }

}
*/
