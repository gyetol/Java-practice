package Duck_separateAlgorithm_practice;

public abstract class Duck {
    private String name;
    private Flyable flyable;

    public Duck(String name,Flyable flyable){
        this.name=name;
        this.flyable=flyable;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public String getName(){
        return this.name;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public abstract void fly();
}
