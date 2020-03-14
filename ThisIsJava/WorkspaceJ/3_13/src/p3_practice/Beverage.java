package p3_practice;

public abstract class Beverage {
    protected String name;
    protected int price;

    public Beverage(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name){
        this.name=name;
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
        pourInWater();
        if(addCondiment) {
            addCondiment();
        }
    }
    public void boilWater(){
        System.out.println("물을 끓입니다.");
    }
    public void pourInWater(){
        System.out.println("컵에 물을 붓습니다.");
    }
    public abstract void brew();

    public abstract void addCondiment();

    @Override
    public String toString() {
        return name + price;
    }
}
