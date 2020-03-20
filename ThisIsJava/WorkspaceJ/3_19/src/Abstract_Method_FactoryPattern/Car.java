package Abstract_Method_FactoryPattern;

public abstract class Car {
    protected String name;
    protected Body body;
    protected Engine engine;
    protected Wheel wheel;

    public Car(String name,Body body,Engine engine,Wheel wheel){
        this.name=name;
        this.body=body;
        this.engine=engine;
        this.wheel=wheel;
    }

    public String getName() {
        return name;
    }

    public String getDescript(){
        StringBuilder sb=new StringBuilder();
        sb.append("바디 :"+body.getDescript()+"\n")
                .append("엔진 :"+engine.getDescript()+"\n")
                .append("바퀴 :"+wheel.getDescript()+"\n");
        return sb.toString();
    }
    public abstract void run();
}
