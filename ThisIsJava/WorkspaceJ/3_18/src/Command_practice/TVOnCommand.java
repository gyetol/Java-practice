package Command_practice;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public String getDescript() {
        return "TV를 켭니다";
    }
}
