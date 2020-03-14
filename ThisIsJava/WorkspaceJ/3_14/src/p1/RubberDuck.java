package p1;

public class RubberDuck extends Duck {
    public RubberDuck(){
        super("고무오리");
    }
    @Override
    public void fly() {
        System.out.println(name+ ":");
        flyable.doFly();
    }
}
