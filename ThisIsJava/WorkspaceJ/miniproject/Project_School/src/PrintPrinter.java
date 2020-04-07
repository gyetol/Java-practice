import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class PrintPrinter implements Printable{
    private Socket socket;

    public PrintPrinter(String serverAddr,int port){
        try {
            this.socket = new Socket(serverAddr, port);
            System.out.println("접속 성공");
        }
        catch (IOException e){
            System.out.println("접속 실패");
        }
    }

    @Override
    public void print(List list) {

    }
}
