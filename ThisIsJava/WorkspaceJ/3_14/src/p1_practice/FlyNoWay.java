package p1_practice;

public class FlyNoWay implements Flyable {
    @Override
    public void doFly() {
        System.out.println("날 수 없어요");
    }
}
