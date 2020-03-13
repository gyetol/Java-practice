package p2;
import p2.duck.Duck;
import p2.duck.MalleredDuck;
import p2.duck.RubberDuck;

public class AppStart {
    public static void main(String[] args) {
        Duck d = new MalleredDuck();
        d.fly();

        Duck r = new RubberDuck();
        r.fly();
    }
}
