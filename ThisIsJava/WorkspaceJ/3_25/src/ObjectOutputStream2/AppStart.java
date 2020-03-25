package ObjectOutputStream2;

public class AppStart {
    public static void main(String[] args) {
        FileObject fObj=null;
        try {
            fObj = new FileObject("C:/temp/data.txt");
            new Thread(new Sender(fObj,"제공자1")).start();
            new Thread(new Sender(fObj,"제공자2")).start();
            new Thread(new User(fObj,"사용자1")).start();
            new Thread(new User(fObj,"사용자2")).start();
            new Thread(new User(fObj,"사용자3")).start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
