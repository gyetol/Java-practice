package FactoryMethod;

public class NewPizzaHutFactory extends PizzaFactory {
    public Pizza createPizza(String name) {
        switch (name){
            case OnionPizza.NAME:
                return new OnionPizza();
            case BaconPizza.NAME:
                return new BaconPizza();
            // break; //미도달코드이면서 데드코드
            case CheesePizza.NAME:
                return new CheesePizza();
            default:
                return null;
        }
    }
}
