package ThreadSync2;

public class AppStart {
    public static void main(String[] args){
        Bank bank= new Bank("우리집통장",10000);
        Thread t1= new Thread(new User("홍길동",bank));
        Thread t2= new Thread(new User("심청이",bank));

        t1.start();
        t2.start();
    }
}
