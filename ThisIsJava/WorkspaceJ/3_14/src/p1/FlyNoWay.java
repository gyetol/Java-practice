package p1;

public class FlyNoWay implements Flyable {
    @Override
    public void doFly() {
        System.out.println("날 수 없습니다.");
    }
}
