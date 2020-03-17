package UserDefinedException;

public abstract class CarException extends Exception{
    public CarException(String msg){
        System.out.println(msg);
    }
    public abstract void doException(Car car);

}
