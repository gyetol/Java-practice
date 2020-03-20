package Abstract_Method_FactoryPattern;

public class BenzCar extends Car {
    private static final String NAME="벤츠자동차";

    public BenzCar(Body body,Engine engine,Wheel wheel){
        super(NAME,body,engine,wheel);
    }

    @Override
    public void run() {
        System.out.println("벤츠카 달린다!");
    }
}
