package CloneTest;

public abstract class Car implements Cloneable {
    protected String name;
    protected String  color;

    public Car(String name,String color){
        this.color=color;
        this.name=name;
    }

    public abstract String toString();

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object o = super.clone(); //부모타입으로 업캐스팅해서 return한다. 주소는 여전히 같다
        Car car =(Car)o;
        car.name=this.name;
        car.color=this.color;
        return car;
    }
}
