package Abstract_Method_FactoryPattern;

public class AppStart {
    public static void main(String[] args) {
        IngredientFactory ifac = new BenzIngredientFactory();
        CarFactory cfac = new BenzCarFactory();
        CarStore cs = new BenzCarStore();

        cfac.setFactory(ifac);
        cs.setFactory(cfac);

        Car car = cs.order();
        System.out.println(car);
        car.run();
    }
}
