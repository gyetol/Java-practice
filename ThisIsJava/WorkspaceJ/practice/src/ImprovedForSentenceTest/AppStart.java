package ImprovedForSentenceTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student {

    private String name;
    private int number;
    private String major;
    private int score;

    public Student(String name,int number,String major,int score){
        this.name=name;
        this.number=number;
        this.major=major;
        this.score=score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getMajor() {
        return major;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        return this.number==((Student)obj).getNumber();
    }

    @Override
    public String toString() {
        return number+" " +name+"의 전공 : "+major+"이며 "+score+"점";
    }
}


public class AppStart {
    public static void main(String[] args) {
        List<Student> students= new LinkedList<>();
        students.add(new Student("김이나",20128585,"작사학과",88));
        students.add(new Student("김이나",20198585,"체육학과",100));
        students.add(new Student("김재호",20184545,"작곡학과",85));
        students.add(new Student("노유타",20148465,"모델학과",97));

        String name= students.get(0).getName();


            if(name==null){
                System.out.println("이름을 지정해주세요");
            }
            List<Student> searchedList= new ArrayList<>();
            for(Student st: students) {
                if (st.getName().equals(name)){
                    searchedList.add(st);
                }
            }
            if(searchedList.size()!=0){
                for(Student st:searchedList){
                    System.out.println(st);
                }
            }
            else{
                System.out.println("못 찾았다.");
            }


    }
}
