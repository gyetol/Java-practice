package FactoryMethod;

public class PizzaHut extends PizzaStore {
    public PizzaHut(){
        super("피자헛");
    }

    @Override
    public Pizza order(String name) {
       return factory.createPizza(name); //delegation이다. 자기가 처리해야할 일을 다른 클래스에 맡기고있다.

    }
}
