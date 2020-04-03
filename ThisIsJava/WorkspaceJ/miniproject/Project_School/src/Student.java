import java.io.Serializable;

public class Student implements Serializable {

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
