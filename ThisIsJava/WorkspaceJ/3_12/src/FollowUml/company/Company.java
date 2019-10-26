package FollowUml.company;
import FollowUml.employees.*;
//import FollowUml.employees.Employee;
//import FollowUml.employees.Regular;

public class Company {
    private Employee[] employees;
    private int count;
    private int capital;

    public Company(int employeeCount,int capital){
        employees= new Employee[employeeCount];
        this.capital=capital;
        this.count=0;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public void setCapital(int capital){
        this.capital=capital;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCapital() {
        return capital;
    }

    public int getCount() {
        return count;
    }

    public boolean hire(Employee employee){
        if(count<employees.length){
            employees[count]=employee;
            count++;
            System.out.println(employee.getName()+"님을 고용하였습니다.");
            return true;
        }
        System.err.println("더 이상 고용할 수 없습니다.");
        return false;
    }

    public Employee find(String name){
        for(Employee emp: employees){
            if(emp.getName().equals(name)){
                return emp;
            }
        }
        return null;
    }

    public Employee[] findAll(String name){
        int cnt=0;
        for(int i=0;i<employees.length;i++)
        {
            if(employees[i].getName().equals(name)) {
                cnt++;
            }
        }
        if(cnt!=0){
            Employee[] emp =new Employee[cnt];
            for(int i=0;i<emp.length;i++)
            {
                emp[i] = find(name);
            }
            System.out.println(cnt+"명 찾았습니다");
            return emp;
        }
        return null;
    }

    /*public Employee[] findAll(String name){
        int cnt=0;
        for(Employee emp : employees){
            if(emp.getName().equals(name)){
                cnt++;
            }
        }
        if(cnt>0){
            Employee[] retEmp=new Employee[cnt];
            int idx=0;
            for(Employee emp : employees){
                if(emp.getName().equals(name)){
                    retEmp[idx]=emp;
                    idx++;
                }
            }
            return retEmp;
        }
        return null;
    }*/

    public void showInfo(){
        System.out.println("자본금: "+capital);
        System.out.println("사원수: "+count+"명");
    }

    public void showInfo(boolean listFlag){
        showInfo();
        if(listFlag){
            showList();
        }
    }
    public void showList(){
        for(Employee emp : employees)
        {
            if(emp instanceof Regular){
                System.out.println("사원명"+emp.getName()+"[정직원]");
            }
            else{
                System.out.println("사원명"+emp.getName()+"[파트타임직원]");
            }
        }
    }
    public void pay(){
        for(int i=0;i<count;i++){
            if(employees[i] instanceof Regular){
                int tmp=((Regular)employees[i]).pay();
                System.out.println(employees[i].getName()+"사원에게"+tmp+"원을 지급하였습니다.");
                capital-=tmp;
            }
            else{
                PartTime pt = (PartTime)employees[i];
                System.out.println(pt.getName()+"사원에게"+pt.pay()+"원을 지급하였습니다.");
                capital-=pt.pay();
            }

        }
    }
}
