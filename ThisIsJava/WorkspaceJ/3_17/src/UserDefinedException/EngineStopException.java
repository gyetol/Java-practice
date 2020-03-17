package UserDefinedException;

public class EngineStopException extends CarException {
    public EngineStopException(String msg){
        super(msg);
    }
    public void doException(Car car){
        System.out.println("엔진을 수리합니다.");
    }
}
