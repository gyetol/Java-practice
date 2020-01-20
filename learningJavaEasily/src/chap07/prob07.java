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
