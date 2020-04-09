package testDataJDBC;

public class Employee {
    private String emp_code;
    private String emp_name;
    private String senior_code;
    private int income;
    private int worktime;
    private Depart depart;
    private Duty duty;
    private Type type;

    public Employee(){
        depart=null;
        duty=null;
        type=null;
    }

    public Employee(String emp_code, String emp_name,
                    String senior_code, int income, int worktime) {
        this();
        this.emp_code = emp_code;
        this.emp_name = emp_name;
        this.senior_code = senior_code;
        this.income = income;
        this.worktime = worktime;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getSenior_code() {
        return senior_code;
    }

    public void setSenior_code(String senior_code) {
        this.senior_code = senior_code;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
