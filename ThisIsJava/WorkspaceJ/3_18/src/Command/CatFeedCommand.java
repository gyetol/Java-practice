package Command;

public class CatFeedCommand implements Command {
    private Cat cat;

    public CatFeedCommand(Cat cat){
        this.cat=cat;
    }

    @Override
    public void execute() {
        cat.feed();
    }
}
