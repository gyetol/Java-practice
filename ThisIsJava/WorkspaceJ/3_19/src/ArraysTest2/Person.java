package ArraysTest2;

public class Person implements Comparable<Person> {
    private String name;
    private int kor;
    private int eng;

    public Person(String name,int kor,int eng){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setKor(int kor){
        this.kor=kor;
    }
    public void setEng(int eng){
        this.eng=eng;
    }
    public String getName(){
        return this.name;
    }
    public int getKor(){
        return this.kor;
    }
    public int getEng(){
        return this.eng;
    }


    public String toString(){
       return String.format("%8s %4d %4d %4d %7.2f",name,kor,eng,(kor+eng),(kor+eng)/2.0); //이 양식대로 새로운 문자열을 만들어낸다
    }


    public int compareTo(Person p){
        return -((this.kor+this.eng) -(p.kor+p.eng));
        // return (new Integer(this.kor+this.eng).compareTo(new Integer(p.kor+p.eng));
        // return ((Integer)(this.eng).compareTo((Integer)(this.eng)));
    }

}
