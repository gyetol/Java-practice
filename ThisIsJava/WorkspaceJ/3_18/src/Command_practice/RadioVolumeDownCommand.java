package Command_practice;

public class RadioVolumeDownCommand implements Command {

    private Radio radio;

    public RadioVolumeDownCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeDown();
    }

    @Override
    public String getDescript() {
        return "라디오 볼륨을 줄입니다.";
    }
}
