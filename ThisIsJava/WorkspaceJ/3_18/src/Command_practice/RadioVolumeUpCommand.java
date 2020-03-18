package Command_practice;

public class RadioVolumeUpCommand implements Command {
    private Radio radio;

    public RadioVolumeUpCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.volumeUp();
    }

    @Override
    public String getDescript() {
        return "라디오 볼륨을 높입니다";
    }
}
