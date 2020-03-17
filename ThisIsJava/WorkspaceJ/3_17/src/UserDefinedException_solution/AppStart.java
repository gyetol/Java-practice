package UserDefinedException_solution;

public class AppStart {
    public static void main(String[] args) {
        Car car =new Car(20,true);
        car.setEngineStopException(new EngineStopException());
        car.setNotEnoughFuelException(new NotEnoughFuelException());
        car.run(150);
    }
}
