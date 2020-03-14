package p3_practice;

public class Tea extends Beverage{
    public Tea(String name,int price){
        super(name,price);
    }

    @Override
    public void brew() {
        System.out.println("차를 우려냅니다.");
    }

    @Override
    public void addCondiment() {
        System.out.println("레몬즙을 짜냅니다.");
    }
}
