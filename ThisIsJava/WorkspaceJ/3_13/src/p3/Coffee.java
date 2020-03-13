package p3;

public class Coffee extends Beverage {

    private String subName="에스프레소";

    private static String productName="커피";
    private static int productPrice =1500;

    public static void setProductName(String productName){
        Coffee.productName=productName;
    }

    public static void setProductPrice(int productPrice) {
        Coffee.productPrice = productPrice;
    }

    public Coffee(){
        super(productName,productPrice);
    }

    public void brew(){
        System.out.println(name+"을 내립니다");
    }
    public void addCondiment(){
        System.out.println(name+"에 설탕을 첨가합니다.");
    }

    public void func(){

    }
}
