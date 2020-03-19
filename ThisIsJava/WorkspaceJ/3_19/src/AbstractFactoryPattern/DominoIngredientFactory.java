package AbstractFactoryPattern;

public class DominoIngredientFactory extends IngredientFactory {
    @Override
    public Dough createDough() {
        return new CheeseDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    public Cheese createCheese(){
        return new ChedaCheese();
    }

    public String toString(){
        return "도미노 재료 공장";
    }
}
