class Jumsu{
    int point;
}

public class AppStart {
    static void f(Jumsu arg){
        arg=new Jumsu();
        arg.point=100;
    }

    static  void f2(Jumsu arg){
        arg.point=100;
    }

    public static void main(String[] args) {
        Jumsu j =new Jumsu();
        f(j);
        System.out.println(j.point);
        f2(j);
        System.out.println(j.point);

        String str= new String("홍길동");
        str="심청이";

        Integer i =1; //Integer i = new Integer(1);
        i=2;
    }
}
