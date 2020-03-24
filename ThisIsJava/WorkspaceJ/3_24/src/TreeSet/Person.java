package TreeSet;

public class Person implements Comparable<Person> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return (kor+eng+math);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+ "의 총점 : "+(kor+eng+math);
    }

    @Override
    public int compareTo(Person o) {
       // return this.name.compareTo(o.name); //이미 String 타입은 compareTo가 구현이 되어있다.
        return -((this.eng+this.kor+this.math)-(o.kor+o.eng+o.math));
       //return Integer.valueOf(o.eng+o.kor+o.math).compareTo(kor+eng+math);
    }
}
