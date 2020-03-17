package UserDefinedException_solution;

public class Car {
    private int fuel;
    private boolean engineOn;
    private EngineStopException engineStopException;
    private NotEnoughFuelException notEnoughFuelException;

    public Car(int fuel, boolean engineOn){
        this.fuel=fuel;
        this.engineOn=engineOn;
    }

    public void setEngineStopException(EngineStopException engineStopException) {
        this.engineStopException = engineStopException;
    }

    public void setNotEnoughFuelException(NotEnoughFuelException notEnoughFuelException) {
        this.notEnoughFuelException = notEnoughFuelException;
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
        return engineOn;
    }

    public void run(int dist){
        try{
            if(!engineOn) throw engineStopException; //멤버로 가지고 있지 않을 경우 new해줘서 던진다
            if(fuel<(dist/10)) throw notEnoughFuelException;
            System.out.println(dist+"km를 주행하였습니다.");
            fuel-=(dist/10);
            System.out.println("현재 남은 연료: " +fuel+"L");
        }
        catch(CarException e){
            System.out.println(e.getMessage());
            e.doException(this);
            this.run(dist);
        }
        finally{
            System.out.println("주행을 종료합니다.");
        }
    }
}
