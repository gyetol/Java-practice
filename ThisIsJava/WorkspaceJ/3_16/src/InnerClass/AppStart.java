package InnerClass;

class Bike implements Car.Runnable{
    @Override
    public void run() {

    }
}
public class AppStart {
    public static void main(String[] args) {
       /* Car c = new Car("현대자동차");
        c.showInfo();

        System.out.println("엔진참조");
        Car.Engine e = c.new Engine(5000);
        e.on();
        Car.Engine e2=c.new Engine(2000);
        e2.on();*/

      /* Car.Engine e = new Car.Engine(3000);
       Car.Engine e2 = new Car.Engine(5000);
       e.on();
       e2.on();*/ //Engine 클래스가 static일때

    }


}
