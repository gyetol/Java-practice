package singleton_seok;

class Singleton {
    // private static Singleton instance = new Singleton(); // 1000번지

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private int a;
    private int b;

    private Singleton(){
        a = 10;
        b = 20;
    }

    public int getA() {
        return a;
    }

    public Singleton setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public Singleton setB(int b) {
        this.b = b;
        return this;
    }


    public int sumAB(){
        return a+b;
    }

    public static Singleton getInstance(){
        return instance;
    }
}


public class Main {
    public static void main(String[] args) {

        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();
        Singleton st4 = Singleton.getInstance();
        Singleton st5 = Singleton.getInstance();
        Singleton st6 = Singleton.getInstance();
        st1.setA(30).setB(35);
        System.out.println(st1.getA());
        System.out.println(st2.getA());
        System.out.println(st1.getB());
        System.out.println(st2.getB());
        System.out.println(st1.sumAB());
        System.out.println(st2.sumAB());
    }
}