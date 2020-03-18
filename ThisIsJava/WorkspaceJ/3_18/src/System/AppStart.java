package System;
/*import java.util.Scanner;

class Driver{

}

public class AppStart {
    public static void main(String[] args) {

        try{
            Class.forName("java.util.Scanner"); //임포트해도 전체경로를 다 써야한다 //인스턴스.getName으로 얻을수도 있다
            System.out.println("드라이버검색성공");
        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버검색실패");
        }

    }
}*/
import java.lang.reflect.Field;
class Person{
    String name;
    static final int age=10;
}

public class AppStart{
    public static void main(String[] args) {
        Person p = new Person();
        Class c = p.getClass();
        Field[] fs= c.getDeclaredFields();
        for(Field f : fs){
            System.out.println(f.getModifiers()+f.getName());
            System.out.println(f.toString());
        }
    }
}
