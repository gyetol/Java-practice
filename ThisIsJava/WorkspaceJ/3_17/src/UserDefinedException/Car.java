package UserDefinedException;

public class Car {

    private int fuel;
    private boolean engineOn;

    public Car(int fuel){
        this.fuel=fuel;
        this.engineOn=true;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public int getFuel() {
        return fuel;
    }

    public boolean getEngineOn(){
       return this.engineOn;
    }


    public void run(int dist){
        try{
            if(engineOn==false){
                throw new EngineStopException("엔진멈춤예외");
            }
            if((dist/10)<=fuel){
                throw new NotEnoughFuelException("연료부족예외");
            }
        }
        catch(CarException e){
            e.doException(this);
        }
        finally {
            System.out.println(dist + "km를 주행하였습니다.");
            fuel -= (dist / 10);
            System.out.println("연료가" + fuel + "L가 남았습니다.");
            return;
        }

    }

}
