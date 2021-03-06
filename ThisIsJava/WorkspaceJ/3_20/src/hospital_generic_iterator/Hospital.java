package hospital_generic_iterator;

public abstract class Hospital<T> implements Curable<T> {
    protected String name;

    public Hospital(String name){
        this.name=name;
    }

    public abstract void showList();
}
