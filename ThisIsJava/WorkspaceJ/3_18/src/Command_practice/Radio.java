package Command_practice;

public class Radio extends Appliance{
    private int volume=50;

    public Radio(){
        super();
    }

    public void on(){
        super.power=true;
    }
    public void off(){
        super.power=false;
    }
    public void volumeUp(){
        this.volume+=10;
    }
    public void volumeDown(){
        this.volume-=10;
    }
}
