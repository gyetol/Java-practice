package testDataJDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
    private static EmployeeDAO instance=new EmployeeDAO();
    private ArrayList<Employee> employees;

    private EmployeeDAO(){}

    public static EmployeeDAO getInstance(){
        return instance;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public boolean registerEmployee(Connection con, Employee employee){
        PreparedStatement pstmt=null;

        try{
            pstmt=con.prepareStatement("insert into employees values(?,?,?,?,?)");
            pstmt.setString(1,employee.getEmp_code());
            pstmt.setString(2,employee.getEmp_name());
            pstmt.setString(3,employee.getSenior_code());
            pstmt.setInt(4,employee.getIncome());
            pstmt.setInt(5,employee.getWorktime());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
