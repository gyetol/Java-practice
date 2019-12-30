package chap06;

public class Test {
    public static void main(String[] args) {
        Person1.show();
        Student1.show();
    }
}

class Person1{
    void name(){}
    //protected void number(){}
    //void weight(){}
    static void show(){System.out.println("퍼슨");}
    private void secret(){}
}
class Student1 extends Person1{
    public void name(){}
   //void number(){}
    //static void weight(){}
    static void show(){System.out.println("학생");}
    private void secret(){}
}
