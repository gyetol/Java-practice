package p3;

public abstract class Beverage {
    protected String name;
    protected int price;

    public Beverage(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void create(boolean addCondiment){
        boilWater();
        brew();
        pourInCup();
        if(addCondiment){
            addCondiment();
        }

    }

    public void boilWater(){
        System.out.println(name+"을 만들 물을 끓입니다");
    }

    public void pourInCup(){
        System.out.println(name+"을 컵에 따릅니다");
    }

    public abstract void brew();
    public abstract void addCondiment();
}
