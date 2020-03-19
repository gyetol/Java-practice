package AbstractFactoryPattern;

public class PizzaStore {
    private IngredientFactory factory;

    public void setFactory(IngredientFactory factory){
        this.factory=factory;
    }

    public Pizza order(){
        Pizza pizza= new Pizza(factory.createDough(),factory.createSauce(),factory.createCheese());
        System.out.println(factory+"에서 재료를 공급받습니다.");
        return pizza;
    }

}
