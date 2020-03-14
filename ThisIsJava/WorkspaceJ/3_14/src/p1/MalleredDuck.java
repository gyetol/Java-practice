package p1;

public class MalleredDuck extends Duck {
    public MalleredDuck(){
        super("천둥오리");
    }


    @Override
    public void fly() {
        System.out.println(name+ ":");
        flyable.doFly();
    }
}
