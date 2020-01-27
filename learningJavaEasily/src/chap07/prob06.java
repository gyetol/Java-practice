package chap07;

public class prob06 {
    public static void main(String[] args) {
        Printable p =new B4();
        Call c = new Call();
        c.invoke(p);
    }
}

interface Printable{

}

class A4 implements Printable{
    public void a(){
        System.out.println("A4");
    }
}


class B4 implements Printable{
    public void b(){
        System.out.println("B4");
    }
}

class Call{
    public void invoke(Object o){
        if(o instanceof A4){
            ((A4)o).a();
        }
        else if (o instanceof B4){
            ((B4)o).b();
        }
        else{
            ;
        }
    }
}

