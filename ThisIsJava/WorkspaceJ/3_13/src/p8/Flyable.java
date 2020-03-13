package p8;

public interface Flyable extends Runnable { //interface는 오직 interface만 상속할 수 있다
    int MAX =100; //public static final 이 생략
    void fly(); //public abstract가 생략
}
