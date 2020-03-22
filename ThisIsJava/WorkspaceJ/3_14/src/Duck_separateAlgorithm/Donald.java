package Duck_separateAlgorithm;

public class Donald extends Duck {
    public  Donald(){
        super("도날드");
    }
    @Override
    public void fly() {
        System.out.println(name+ ":");
        flyable.doFly();
    }
}
