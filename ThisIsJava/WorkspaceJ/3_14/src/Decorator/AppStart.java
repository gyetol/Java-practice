package Decorator;

public class AppStart {
    public static void main(String[] args) {
        Beverage b = new Coffee();
         b = new Sugar(b);
         b= new Sugar(b);
         b= new Lemon(b);
        System.out.println(b.getName()+ ":"+b.getCost()+"원");
         Beverage c = new Lemon(null);
        System.out.println(c.getName()+ ":"+c.getCost()+"원");


    }
}
