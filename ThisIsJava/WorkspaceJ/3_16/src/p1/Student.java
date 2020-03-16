package p1;

public class Student implements Learnable{
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int rank;

    public Student(String name,int kor,int eng,int math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
        this.rank=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getRank() {
        return rank;
    }
    public int getTot(){
        return (kor+eng+math);
    }
    public double getAvg(){
        return (getTot()/3.0);
    }
    public void show(){
        System.out.printf("%4d %4d %4d %4d %6.2f %4d",kor,eng,math,getTot(),getAvg(),getRank());
    }

    @Override
    public void study() {
        System.out.println("공부를 합니다 학생이");
    }
}
