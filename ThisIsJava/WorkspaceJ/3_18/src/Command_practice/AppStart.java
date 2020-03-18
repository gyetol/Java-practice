package Command_practice;

public class AppStart {
    public static void main(String[] args) {
        RemoteController rc= new RemoteController(4);

        TV tv=new TV();
        Radio radio= new Radio();

        TVOnCommand onTv = new TVOnCommand(tv);
        TVOffCommand offTv = new TVOffCommand(tv);
        RadioOnCommand onRadio= new RadioOnCommand(radio);
        RadioOffCommand offRadio= new RadioOffCommand(radio);
        RadioVolumeUpCommand volumeUpCommand= new RadioVolumeUpCommand(radio);
        RadioVolumeDownCommand volumeDownCommand= new RadioVolumeDownCommand(radio);

        rc.setCommand(0,onTv,offTv);
        rc.setCommand(1,onRadio,offRadio);
        rc.setCommand(2,volumeUpCommand,volumeDownCommand);

        rc.onButtonClick(1); //라디오를 켭니다
        rc.offButtonClick(2); //라디오 볼륨을 줄입니다.

        rc.undoButtonClick();
    }
}
