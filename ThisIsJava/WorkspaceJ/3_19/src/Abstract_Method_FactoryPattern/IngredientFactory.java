package Abstract_Method_FactoryPattern;

public abstract class IngredientFactory {
    protected String name;

    public IngredientFactory(String name){
        this.name=name;
    }
    public abstract Body createBody();
    public abstract Engine createEngine();
    public abstract Wheel createWheel();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescript(){
        return name;
    }
}
