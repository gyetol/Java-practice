package generic2;

public class Person {
    public static final String TYPE="모든사람";
    protected String name;

    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString()+":"+getName();
    }
}
