package UserDefinedException_solution;

public class EngineStopException extends CarException {
    private static final String MESSAGE = "엔진이 정지된 상태입니다.";

    public EngineStopException(){
        super(MESSAGE);
    }

    @Override
    public void doException(Car car) {
        System.out.println("엔진을 구동합니다.");
        car.setEngineOn(true);
    }
}
