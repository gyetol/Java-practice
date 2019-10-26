public class Jumsu1 {
    static int count;
    int kor;
    int eng;

    static {
        System.out.println("스태틱");
        count=0;
    }
   /* static int getNumber(){
        return kor;
    }*/
    public Jumsu1(){
        this(0,0);
        System.out.println("생성자호출");
    }
    public Jumsu1(int kor,int eng)
    {
        this.kor=kor;
        this.eng=eng;
    }

    public void setKor(int kor){
        this.kor=kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getEng() {
        return eng;
    }

    public int getKor() {
        return kor;
    }
    public int getTot(){
        return (kor+eng);
    }
    public double getAvg(){
        return (((double)kor+eng)/2); // return (getTot()/2.0);
    }
    public void show(){
        System.out.printf("%3d %3d %3d %6.2f\n",kor,eng,getTot(),getAvg());
    }

    public static void main(String[] args) {
        Jumsu1 j1= new Jumsu1(100,90);
        Jumsu1 j2= new Jumsu1(90,90);
        j1.show();
        j2.show();
        Jumsu1 j =null;
        Jumsu1.count++;
        Jumsu1.count++;
        Jumsu1.count++;
    }
}
