package prob07;

public class prob01 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100,50);
        c.show();
    }
}

abstract class Abstract{
    int i;
    abstract void show();
}
