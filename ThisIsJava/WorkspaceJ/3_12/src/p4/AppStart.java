package p4;

class A{
    public A(){
        System.out.println("A()");
    }
}

class B extends A{
    public B(){
        System.out.println("B()");
    }
}

class C extends B{
    public C(){
        System.out.println("C()");
    }
}

public class AppStart {
    public static void main(String[] args) {
        Student s = new Student("홍길동", "전산학과");
        System.out.println(s);
    }
}
