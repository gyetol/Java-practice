package TeamProject_School;


public class Student {
    private String name;
    private String major;
    private int number;
    private int score;

    public Student(String name,String major,int number,int score) {
        this.name=name;
        this.major=major;
        this.number=number;
        this.score=score;
    }

    public void setName(String name) {this.name=name;}
    public String getName() {return name;}
    public void setMajor(String major) {this.major=major;}
    public String getMajor() {return major;}
    public void setNumber() {this.number=number;}
    public int getNumber() {return number;}
    public void setScore(int score) {this.score=score;}
    public int getScore() {return score;}

    public String toString() {
        return (name+"("+major+":"+number+")"+score);
    }


}
