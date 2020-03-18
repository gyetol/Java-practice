package toString;

public class Student extends Person {
    String major;
    double jumsu;

    public Student(String name,int age,String major,double jumsu){
        super(name,age);
        this.major=major;
        this.jumsu=jumsu;
    }

    @Override
    public int hashCode() {
        /*double prime=41.12;
        double result=1;
        result=(prime*result+(major==null?0:major.hashCode()))*1000;
        result=(prime*result+jumsu)*1000;

        return (int)result;*/

        int prime=31;
        int result= super.hashCode();
        result=prime*result+(major==null?0:major.hashCode());
        result=prime*result+(new Double(jumsu).hashCode());
        return result;
    }
    public void finalize(){
        super.finalize();
        System.out.println("학생의 소멸자호출");
    }
}