package hospital_generic_iterator;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
