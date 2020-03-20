package Abstract_Method_FactoryPattern;

public abstract class CarStore {
    protected CarFactory factory;
    protected String name;

    public CarStore(String name){
        this.name=name;
    }
    public abstract Car order();

    public void setName(String name) {
        this.name = name;
    }

    public void setFactory(CarFactory factory) {
        this.factory = factory;
    }

    public String getName() {
        return name;
    }
    public String getDescript(){
        return name;
    }
}
