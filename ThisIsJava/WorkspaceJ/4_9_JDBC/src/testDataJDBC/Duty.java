package testDataJDBC;

import java.util.ArrayList;

public class Duty {
    private String duty_code;
    private String duty_name;
    private ArrayList<Employee> employees;

    public Duty(){
        employees=new ArrayList<Employee>();
    }

    public Duty(String duty_code, String duty_name) {
        this();
        this.duty_code = duty_code;
        this.duty_name = duty_name;
    }

    public String getDuty_code() {
        return duty_code;
    }

    public void setDuty_code(String duty_code) {
        this.duty_code = duty_code;
    }

    public String getDuty_name() {
        return duty_name;
    }

    public void setDuty_name(String duty_name) {
        this.duty_name = duty_name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
