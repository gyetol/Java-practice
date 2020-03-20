package Abstract_Method_FactoryPattern;

public class BenzEngine extends Engine {
    private static final String NAME="벤츠엔진";

    public BenzEngine(){
        super(NAME);
    }

    @Override
    public String getDescript() {
        return NAME;
    }
}
