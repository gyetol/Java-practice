package Abstract_Method_FactoryPattern;

public abstract class CarFactory {
    protected IngredientFactory factory;
    protected String name;

    public CarFactory(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getDescript(){
        return name;
    }

    public void setFactory(IngredientFactory factory) {
        this.factory = factory;
    }
    public abstract Car createCar();
}
