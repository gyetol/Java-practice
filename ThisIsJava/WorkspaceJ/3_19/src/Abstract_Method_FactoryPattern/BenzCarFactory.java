package Abstract_Method_FactoryPattern;

public class BenzCarFactory extends CarFactory {
    private static final String NAME="벤츠자동차공장";

    public BenzCarFactory(){
        super(NAME);
    }

    @Override
    public Car createCar() {
        return new BenzCar(factory.createBody(),factory.createEngine(),factory.createWheel());
    }
}
