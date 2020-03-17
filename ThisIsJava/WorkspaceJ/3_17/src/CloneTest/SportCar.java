package CloneTest;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String name,String color,int maxSpeed){
        super(name,color);
        this.maxSpeed=maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String toString(){
        return ("이름 : "+name+",색상:"+color+", 최대속도:"+maxSpeed);
    }

    public Object clone() throws CloneNotSupportedException{
        Object o =super.clone();
        SportCar sportCar=(SportCar)o;
        sportCar.maxSpeed=this.maxSpeed;
        return sportCar;
    }
}
