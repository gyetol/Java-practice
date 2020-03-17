package UserDefinedException;

public class NotEnoughFuelException extends Exception {
    public NotEnoughFuelException(){
        this("연료가 부족합니다. 주행불가");
    }
    public NotEnoughFuelException(String msg){
        super(msg);
    }

    public void doExcept(Car car){
        System.out.println("자동차의 연료를 100L 채웁니다.");
        car.setFuel(100);
    }

}
