package p1_practice;

public class MalleredDuck extends Duck {
    public static final String NAME="청둥오리";

    public MalleredDuck() {
        super(NAME,new FlyWithWing());
    }

    public MalleredDuck(String name) {
        super(name,new FlyWithWing());
    }

    public MalleredDuck(String name, Flyable flyable) {
        super(name, flyable);
    }

    @Override
    public void fly() {
        System.out.println(super.getName()+" : ");
        super.getFlyable().doFly();
    }
}
