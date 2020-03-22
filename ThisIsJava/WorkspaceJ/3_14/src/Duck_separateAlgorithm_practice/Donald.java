package Duck_separateAlgorithm_practice;

public class Donald extends Duck {

    public static final String NAME="도널드";

    public Donald(){
        super(NAME,new FlyWithWing());
    }
    public Donald(String name){
        super(name,new FlyWithWing());
    }
    public Donald(String name,Flyable flyable){
        super(name,flyable);
    }

    @Override
    public void fly() {
        System.out.println(super.getName() +" : ");
        super.getFlyable().doFly();

    }


}
