package Command_practice;

public class TV extends Appliance {

    public TV(){
        super();
    }

    public void on(){
        super.power=true;
    }
    public void off(){
        super.power=false;
    }
}
