package Grouping;

public class Student implements Learnable {
    private String name;
    private Major[] majors;
    private int majorCnt;

    public Student(String name){
        this.name=name;
        this.majors=null;
        this.majorCnt=0;
    }
   public boolean addMajor(Major major){
        if(majors==null){
            majors=new Major[10];
            majors[majorCnt++]=major;
            return true;
        }
        else if(majorCnt==majors.length){
            System.out.println("더 이상 수강할 수 없습니다.");
            return false;
        }
        else{
            majors[majorCnt]=major;
            return true;
        }
   }
    @Override
    public void study(Teacher teacher) {

    }
}
