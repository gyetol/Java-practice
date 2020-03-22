package Duck_separateAlgorithm_practice;

public class RubberDuck extends Duck {
    public static final String NAME="러버덕";

    public RubberDuck() {
        super(NAME,new FlyNoWay());
    }

    public RubberDuck(String name) {
        super(name,new FlyNoWay());
    }

    public RubberDuck(String name, Flyable flyable) {
        super(name, flyable);
    }

    @Override
    public void fly() {
        System.out.println(super.getName()+" : ");
        super.getFlyable().doFly();
    }
}
