package Command_practice;

public class RadioOffCommand implements Command{
    private Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.off();
    }

    @Override
    public String getDescript() {
        return "라디오를 끕니다";
    }
}
