package ThreadPractice2;

public class AppStart {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.add("고구마빵");
        bakery.add("소보로빵");
        bakery.add("레몬빵");

       Thread t1 = new Thread(new Student("홍길동",bakery,Thread.currentThread()));
       Thread t2 = new Thread(new Student("심청이",bakery,t1));
       Thread t3 = new Thread(new Student("고길동",bakery,t2));
       Thread t4 = new Thread(new Student("변사또",bakery,t3));

       t1.start();
       t2.start();
       t3.start();
       t4.start();

        System.out.println("메인프로그램 종료");
    }
}
