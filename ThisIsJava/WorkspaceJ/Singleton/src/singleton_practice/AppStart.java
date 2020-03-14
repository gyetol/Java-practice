package singleton_practice;

public class AppStart {
    public static void main(String[] args) {
        MyLady m1= MyLady.getInstance("박지원",23,"01023451234");
        MyLady m2= MyLady.getInstance("최윤하",25,"01084850334");
        System.out.println(m1);
        System.out.println(m2);
    }
}
