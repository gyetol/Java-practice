package toString;

public class AppStart {
    public static void main(String[] args) {
        Student s = new Student("홍길동",20,"경제학과",89.5);
        System.out.println(s.getClass().getName()+"@"+Integer.toHexString(s.hashCode()));
        s=null;
        System.gc();
    }
}
