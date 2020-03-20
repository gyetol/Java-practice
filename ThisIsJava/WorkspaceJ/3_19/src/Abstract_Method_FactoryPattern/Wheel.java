package Abstract_Method_FactoryPattern;

public abstract class Wheel {
    protected String name;

    public Wheel(String name){
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
