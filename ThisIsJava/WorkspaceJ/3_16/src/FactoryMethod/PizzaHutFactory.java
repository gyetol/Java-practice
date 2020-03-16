package FactoryMethod;

public class PizzaHutFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String name) {
        switch (name){
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
