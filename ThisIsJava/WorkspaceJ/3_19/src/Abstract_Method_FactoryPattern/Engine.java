package Abstract_Method_FactoryPattern;

public abstract class Engine {
    protected String name;

    public Engine(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescript();
}
