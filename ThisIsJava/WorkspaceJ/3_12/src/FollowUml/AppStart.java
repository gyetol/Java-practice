package FollowUml;
import FollowUml.company.Company;
import FollowUml.employees.*;
public class AppStart {

    private Company company;

    public AppStart(int count,int capital){
        company=new Company(count,capital);
    }

    public void start(){
        company.hire(new Regular("심청이",3500000));
        company.hire(new Regular("홍길동",3500000));
        company.hire(new Regular("홍길동",2300000));
        company.hire(new PartTime("에디슨",120,9000));
        company.hire(new PartTime("제이슨",100,8600));
        company.showInfo();
        company.showList();
        company.pay();
        company.showInfo(true);

        Employee emp = company.find("홍길동");
        if(emp!=null){
            System.out.println(emp.getName()+"검색에 성공하였습니다.");
        }
        else{
            System.err.println("검색에 실패하였습니다.");
        }
        Employee[] emps= company.findAll("홍길동");
        if(emps==null){
            System.err.println("홍길동 사원 검색 실패!!!");
        }
        else{
            System.out.println(emps.length+"명이 검색되었습니다.");
            for(Employee e : emps){
                System.out.println(e.getName());
            }
        }
    }


    public static void main(String[] args) {
        AppStart app = new AppStart(3,10000000);
        app.start();
    }
}
