package p3_practice;

public class Coffee extends Beverage {
    private String subname = "에스프레소";

    private static String productName;
    private static int productPrice;

    public static void setProductName(String productName){
        Coffee.productName=productName;
    }

    public static void setProductPrice(int productPrice) {
        Coffee.productPrice = productPrice;
    }

    public Coffee(String name,int price){
        super(name,price);
    }

    @Override
    public void brew() {
        System.out.println("커피를 내립니다.");
    }

    @Override
    public void addCondiment() {
        System.out.println("설탕을 첨가합니다.");
    }
}
