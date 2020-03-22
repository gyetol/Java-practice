package p1;

public class AppStart {
    public static void main(String[] args) {
        /*Duck d1 = new Donald();
        RubberDuck d2 = new RubberDuck();
        Duck[] ds = new Duck[] {d1,d2}; //배열명이랑 d1,d2로 접근가능
        Duck[] ds2= new Duck[] {new Donald(),new RubberDuck(),new MalleredDuck()}; //배열명으로만 접근가능

        for(int i=0;i<ds2.length;i++){
            ds2[i].fly();
        }*/

        Duck d1 = new MalleredDuck();
        Duck d2 = new RubberDuck();
        Duck d3 = new Donald();

        d1.setFlyable(new FlyByWing());
        d2.setFlyable(new FlyNoWay());
        d3.setFlyable(new FlyNoWay());

        d1.fly();
        d2.fly();
        d3.fly();

        d3.setFlyable(new FlyByWing());

        d1.fly();
        d2.fly();
        d3.fly();

        d1.getFlyable().doFly();
        d2.getFlyable().doFly();
        d3.getFlyable().doFly();
    }
}
