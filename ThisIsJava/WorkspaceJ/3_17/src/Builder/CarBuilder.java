package Builder;

public class CarBuilder {
    private Car car;
    private static CarBuilder instance;

    private CarBuilder(){

    }

    public static CarBuilder getBuilder(){
        if(instance==null){
            instance= new CarBuilder();
        }
        instance.car =new Car("소나타","검정",2500);
        return instance;
    }

    public CarBuilder setName(String name){
        this.car.setName(name);
        return this;
    }
    public CarBuilder setColor(String color){
        this.car.setColor(color);
        return this;
    }
    public CarBuilder setDisp(int disp){
        this.car.setDisp(disp);
        return this;
    }
    public Car getInstance(){ //getCar대신에 getInstance라는 이름을 많이 쓴다
        return car;
        //return new Car(car.getName(),car.getColor(),car.getDisp()); //복사본으로 하는 법
    }
}
