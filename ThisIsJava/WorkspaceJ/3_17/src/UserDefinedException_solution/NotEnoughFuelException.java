package UserDefinedException_solution;

public class NotEnoughFuelException extends CarException {
    private final static String MESSAGE="연료가 부족합니다.";

    public NotEnoughFuelException(){
        super(MESSAGE);
    }

    @Override
    public void doException(Car car) {
        System.out.println("연료를 20L를 채웁니다.");
        car.setFuel(20);

    }
}
