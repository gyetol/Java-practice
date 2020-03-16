package FactoryMethod;

public class AppStart {
    public static void main(String[] args) {
        PizzaStore store= new PizzaHut();
        store.setFactory(new PizzaHutFactory());
        Pizza baconPizza=store.order(BaconPizza.NAME);
        System.out.println(baconPizza.getDescript());

        Pizza cheesePizza=store.order(CheesePizza.NAME);
        System.out.println(cheesePizza.getDescript());

        store.setFactory(new NewPizzaHutFactory());
        Pizza onionPizza=store.order(OnionPizza.NAME);
        System.out.println(onionPizza.getDescript());

        //어떻게 피자를 어떻게 만들지는 가장하위클래스에게 맡기는 것이다!!
        //그럼 클래스를 뜯어고치지 않아도 돼
    }
}
