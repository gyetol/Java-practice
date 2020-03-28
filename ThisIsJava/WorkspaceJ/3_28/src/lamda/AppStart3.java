package lamda;

interface Calculator{
    int max(int a, int b);
}

class Computer{
    public int calc(Calculator calculator,int x,int y){
        return calculator.max(x,y);
    }
}

class Computer2{
    int x;
    int y;

    public Computer2(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int calc(Calculator calculator){
        return calculator.max(this.x,this.y);
    }
}

public class AppStart3 {
    public static void main(String[] args) {

        Computer c =new Computer();
        c.calc((a,b)-> {return (a>b? a:b);}, 10, 20);

        Computer2 c2= new Computer2(100,200);
        int max= c2.calc((a,b)->{return a>b?a:b;});



    }
}
