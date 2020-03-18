package Command_practice;

public  abstract class Appliance {
    protected boolean power;

    public Appliance(){
        this.power=false;
    }

    public abstract void on();
    public abstract void off();
}
