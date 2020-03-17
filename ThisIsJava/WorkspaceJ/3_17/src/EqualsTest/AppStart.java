package EqualsTest;

public class AppStart {
    public static void main(String[] args) {
        /*Student s1 = new Student("홍길동",20,"전산학과",90);
        Student s2 = new Student("심청이",16,"전산학과",90);
        Student s3 = new Student("홍길동",20,"전산학과",90);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));*/

        Student s = new Student("홍길동",20,"전산학과",50);
        Person p = new Student("홍길동",20,"전산학과",50);
        Object o= new Student("홍길동",20,"전산학과",50);

        System.out.println(s.equals(p));
        System.out.println(o.equals(s));

    }
}
