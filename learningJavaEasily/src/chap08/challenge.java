package chap08;

public class challenge {
    public static void main(String[] args) {
        Controllable tv = new TV("길동이는");

        tv.power(true);
    }
}

class TV implements Controllable{
    String who;
}