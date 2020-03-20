package Abstract_Method_FactoryPattern;

public class BenzWheel extends Wheel {
    private static final String NAME="벤츠바퀴";

    public BenzWheel(){
        super(NAME);
    }

    @Override
    public String getDescript() {
        return NAME;
    }
}
