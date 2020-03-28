package lamda;

interface Printable{
    void print(String name);
}



interface Calculator1{
    int sum(int x ,int y);
}

public class AppStart {
    public static void main(String[] args) {

    /*   Printable p =new Printable(){
         public void print(String name){
             System.out.println(name);
         }
       };*/

       Printable p =name-> //인수가 하나일땐 괄호 안쳐도 된다. 인수가 없을땐 빈괄호, 2개이상일땐 괄호쳐야함
               System.out.println(name); //라인이 하나일땐 중괄호 안써도 된다
        p.print("홍길동");

        Calculator1 c = (x,y)->{return x+y;}; //return은 2개의 시퀀스이므로 중괄호로 묶어야한다.
        Calculator1 d = (x,y)->x+y;

        System.out.println(c.sum(1,20));
    }
}
