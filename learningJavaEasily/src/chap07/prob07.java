package chap07;

public class prob07 {
    public static void main(String[] args) {
        Human.echo();

        Student s =new Student(20);
        s.print();
        s.eat();

        Person p = new Person();
        p.print();
        p.eat();

    }
}

interface Human{
    void eat();
    public static void echo(){
        System.out.println("야호!!!");
    }
    public default void print(){
        System.out.println("인간입니다.");
    }
}

class Worker implements Human{
    public void eat(){
        System.out.println("빵을 먹습니다.");
    }
}

class Student implements Human{
    private int age;
    public Student(int age){
        this.age=age;
    }
    public void eat(){
        System.out.println("도시락을 먹습니다.");
    }
    public void print(){
        System.out.println(age+"세의 학생입니다.");
    }
}

class Person extends Worker{

}