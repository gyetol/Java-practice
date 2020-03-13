package p3;

public class Tea extends Beverage {
    private static String productName="홍차";
    private static int productPrice=1000;

    public static void setProductName(String productName) {
        Tea.productName = productName;
    }

    public static void setProductPrice(int productPrice) {
        Tea.productPrice = productPrice;
    }

    public Tea(){
        super(productName,productPrice);
    }

    @Override
    public void brew() {
        System.out.println(name+"을 우려냅니다.");
    }
    @Override
    public void addCondiment() {
        System.out.println(name+"에 레몬을 첨가합니다.");
    }
}
