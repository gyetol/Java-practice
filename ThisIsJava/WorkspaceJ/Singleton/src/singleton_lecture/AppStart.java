package singleton_lecture;

public class AppStart {
    public static void main(String[] args) {
        MyLady m1= MyLady.getInstance();
        MyLady m2= MyLady.getInstance();
        System.out.println(m1);
        System.out.println(m2);

        //println,print 출력 메서드에 객체가 주어지는 경우에는
        //주어지는 객체의 toString() 메서드가 반환하는 값을 출력합니다.
    }
}
