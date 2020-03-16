package p1;
@FunctionalInterface
interface Calc{
    public abstract int sum(int a,int b);
}

public class AppStart {
    public static void main(String[] args) {
        Calc c = new Calc(){
           public int sum(int a,int b){
                return (a+b);
            }
        };
        int s= c.sum(10,20);
    }
}
