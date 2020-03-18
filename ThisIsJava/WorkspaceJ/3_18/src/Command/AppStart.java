package Command;

public class AppStart {
    public static void main(String[] args){
        TV tv= new TV();
        Cat cat= new Cat();
        Command tvOn = new TVOnCommand(tv);
        Command tvOff = new TVOffCommand(tv);
        Command catWakeup = new CatWakeUpCommand(cat);
        Command catFeed = new CatFeedCommand(cat);
        RemoteController rc= new RemoteController();
        rc.setCommand(0,tvOn);
        rc.setCommand(1,tvOff);
        rc.buttonPressed(0);
        rc.buttonPressed(1);
        rc.buttonPressed(2);
        rc.setCommand(2,catWakeup);
        rc.setCommand(3,catFeed);
        rc.buttonPressed(0);
        rc.buttonPressed(1);
        rc.buttonPressed(2);
        rc.buttonPressed(3);

    }
}
