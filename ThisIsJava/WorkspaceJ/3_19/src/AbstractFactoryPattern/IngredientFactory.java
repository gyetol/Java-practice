package AbstractFactoryPattern;

public abstract class IngredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract String toString();
}
