package Exception;
class A{
}
class B extends A{}

public class AppStart {
    public void a() throws NumberFormatException{
        b();
    }
    public void b() throws NumberFormatException{
        c();
    }
    public void c() throws NumberFormatException{
        String str="삼점일사";
        double d=Double.parseDouble(str);
        System.out.println(d);
    }

    public static void funcA() throws Exception{
        throw new Exception("테스트예외");
    }
    public static void main(String[] args) throws NumberFormatException {
       AppStart app=new AppStart();
       app.a();
    }
}
