package chap07;

public class prob01 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100,50);
        c.show();
    }
}

abstract class Abstract{
    int i;
    abstract void show();
    public Abstract(int i){
        this.i=i;
    }
}
class Concrete extends Abstract{
    int j;
    void show(){
        System.out.println("i = "+i+", j = "+j);
    }
    public Concrete(int i,int j){
        super(i);
        this.j=j;
    }
}
