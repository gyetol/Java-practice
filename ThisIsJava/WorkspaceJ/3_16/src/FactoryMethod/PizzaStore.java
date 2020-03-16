package FactoryMethod;

public abstract class PizzaStore {
    protected String name;
    protected PizzaFactory factory;

    public PizzaStore(String name)
    {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFactory(PizzaFactory factory) {
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public abstract Pizza order(String name);

}
