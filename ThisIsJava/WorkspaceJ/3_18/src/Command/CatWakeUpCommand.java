package Command;

public class CatWakeUpCommand implements Command {
    private Cat cat;

    public CatWakeUpCommand(Cat cat){
        this.cat=cat;
    }

    @Override
    public void execute() {
        cat.wakeUp();
    }
}
