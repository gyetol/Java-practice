package Decorator;

public abstract class Decorator extends Beverage {
    protected Beverage beverage;
    public Decorator(Beverage beverage,String name,int cost){
        super(name,cost);
        this.beverage=beverage;
    }

    @Override
    public String getName() {
        if(beverage!=null) {
            return beverage.getName() + "," + name;
        }
        return name;
    }

    @Override
    public int getCost() {
        if(beverage!=null) {
            return beverage.getCost() + cost; //super.getCost() + cost랑 왜 다르지
        }
        return cost;
    }
}
