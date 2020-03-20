package Abstract_Method_FactoryPattern;

public class BenzBody extends Body {
    private static final String NAME="벤츠바디";
    public BenzBody(){
        super(NAME);
    }

    @Override
    public String getDescript() {
        return NAME;
    }
}
