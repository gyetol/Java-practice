package Command_practice;

public class RadioOnCommand implements Command {
    private Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.on();
    }

    @Override
    public String getDescript() {
        return "라디오를 켭니다";
    }
}
