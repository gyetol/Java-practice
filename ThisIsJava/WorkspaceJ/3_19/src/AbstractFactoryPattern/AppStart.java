package AbstractFactoryPattern;

public class AppStart {
    public static void main(String[] args) {

        PizzaStore store=new PizzaStore();
        store.setFactory(new PizzaHutIngredientFactory());
        Pizza pizza =store.order();
        System.out.println(pizza);

        store.setFactory(new DominoIngredientFactory());
        pizza=store.order();
        System.out.println(pizza);



    }
}
