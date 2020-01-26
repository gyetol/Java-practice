package chap07;

public class prob05 {
    public static void main(String[] args) {
        Controller[] c={new TV(false),new Radio(true)};

        for (Controller controller : c)
        {
            controller.show();
        }
    }
}

abstract class Controller{
    protected boolean power=false;
    public void show(){
        if(power==false){
            System.out.println("제품이 꺼졌습니다.");
        }
        else {
            System.out.println("제품이 켜졌습니다.");
        }
    }
    public abstract String getName();
}

class TV extends Controller{
    private String name="TV";
    public TV(boolean tf){
        this.power=tf;
    }
    public void show(){
        if(power==false){
            System.out.println(name+"가 꺼졌습니다.");
        }
        else {
            System.out.println(name+"가 켜졌습니다.");
        }
    }
    public String getName(){
        return this.name;
    }
}

class Radio extends Controller{
    private String name="라디오";
    public Radio(boolean tf){
        this.power=tf;
    }
    public void show(){
        if(power==false){
            System.out.println(name+"가 꺼졌습니다.");
        }
        else {
            System.out.println(name+"가 켜졌습니다.");
        }
    }
    public String getName(){
        return this.name;
    }
}