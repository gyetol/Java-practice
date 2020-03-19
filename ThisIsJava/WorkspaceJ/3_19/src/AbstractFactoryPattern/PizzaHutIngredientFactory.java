package AbstractFactoryPattern;

public class PizzaHutIngredientFactory extends IngredientFactory {

    @Override
    public Dough createDough() {
        return new CheeseDough();
    }

    @Override
    public Sauce createSauce() {
        return new SalsaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChedaCheese();
    }

    @Override
    public String toString() {
        return "피자헛 재료공장";
    }
}
