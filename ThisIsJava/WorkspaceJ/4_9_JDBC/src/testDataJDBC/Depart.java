package testDataJDBC;

import java.util.ArrayList;

public class Depart {
    private String dept_code;
    private String dept_name;
    private ArrayList<Employee> employees;

    public Depart(){
        employees=new ArrayList<Employee>();
    }

    public Depart(String dept_code, String dept_name) {
        this();
        this.dept_code = dept_code;
        this.dept_name = dept_name;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
