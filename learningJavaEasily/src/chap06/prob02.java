package chap06;

public class prob02 {
    public static void main(String[] args) {
        Person[] p= {new Person("길동이",22),new Student("황진이",23,100),
                new ForeignStudent("Amy",30,200,"USA")};
            for(Person a:p)
            {
                a.show();
            }
            p[1].setName("하하하");
           System.out.println(p[1].getName());
    }
}

class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("사람[이름 : "+name+", 나이 : "+age+"]");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    int studentNumber;
    public Student(String name,int age,int studentNumber){
        super(name,age);
        this.studentNumber=studentNumber;
    }
    void show(){
        System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNumber+"]");
    }
}

class ForeignStudent extends Student{
    String country;
    public ForeignStudent(String name,int age,int studentNumber,String country){
        super(name,age,studentNumber);
        this.country=country;
    }
    void show(){
        System.out.println("외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNumber+", 국적 : "+country+"]");
    }
}