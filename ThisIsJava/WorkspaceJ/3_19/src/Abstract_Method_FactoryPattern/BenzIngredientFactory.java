package Abstract_Method_FactoryPattern;

public class BenzIngredientFactory extends IngredientFactory {
    private static final String NAME="벤츠재료공장";

    public BenzIngredientFactory(){
        super(NAME);
    }

    @Override
    public Body createBody() {
        return new BenzBody();
    }

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }

    @Override
    public Wheel createWheel() {
        return new BenzWheel();
    }
}
