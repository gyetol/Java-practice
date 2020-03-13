package p3;

public class AppStart {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Beverage beverage = shop.order("커피",false);
    }
}
