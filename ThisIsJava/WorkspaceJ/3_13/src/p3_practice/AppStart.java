package p3_practice;

public class AppStart {
    public static void main(String[] args) {
        Beverage beverage1;
        Beverage beverage2;
        Shop sh = new Shop();
       beverage1= sh.order("홍차",true);
       beverage2= sh.order("커피",false);
        System.out.println(beverage1);
        System.out.println(beverage2);
    }
}
