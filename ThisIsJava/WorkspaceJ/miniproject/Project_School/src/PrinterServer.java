import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class PrinterServer {
    private ServerSocket serverSocket;

    public PrinterServer(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("서버생성에 성공했습니다.");
        }
        catch(IOException e){
            System.out.println("서버생성에 실패하였습니다.");
        }
    }

    public static void main(String[] args) {

        BufferedWriter bw=null;
        OutputStream os=null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("포트번호를 입력하세요:");
        int port=scanner.nextInt();

        PrinterServer printerServer = new PrinterServer(port);
        try {
            Socket socket = printerServer.serverSocket.accept();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
