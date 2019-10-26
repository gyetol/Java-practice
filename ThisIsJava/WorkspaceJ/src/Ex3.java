public class Ex3{
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        System.out.println(o1==o2);
        System.out.print(o1.equals(o2));
 //object는 객체가 다르면 equals해도 다르다고 본다
    }
}
