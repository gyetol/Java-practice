package p1_practice;

public class AppStart {
    public static void main(String[] args){
        RubberDuck rubberDuck = new RubberDuck();
        MalleredDuck malleredDuck = new MalleredDuck("청둥이");
        Donald donald = new Donald("도널드에요!",new FlyNoWay());

        rubberDuck.fly();
        malleredDuck.fly();
        donald.fly();

        donald.setFlyable(new FlyWithWing());
        donald.fly();

    }
}
