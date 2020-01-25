package chap07;

public class prob02{
    public static void main(String[] args) {
        Yammy y=new Yammy();
        y.eat();
        y.sweet();
    }
}

interface Edible{
    public abstract void eat();
}

interface Sweetable{
    public abstract void sweet();
}

interface Delicious extends Edible,Sweetable{

}

class Yammy implements Delicious{
    public void eat(){
        System.out.println("먹다");
    }
    public void sweet(){
        System.out.println("달다");
    }
}



