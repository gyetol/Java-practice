package TeamProject_School;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;

public class PrintServer {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        BufferedReader in=null;

        try{
            serverSocket=new ServerSocket(9000);
            System.out.println("서버가 9000번 포트로 대기중입니다.");

            Socket socket=serverSocket.accept();
            InetAddress client=socket.getInetAddress();
            System.out.println(client.getHostName()+"가 접속하였습니다.");

            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str=null;
            while(true) {
                str= in.readLine();
                if (str==null) {
                    System.out.println(client.getHostName() + "와의 연결이 종료되었습니다.");
                    break;
                }
                System.out.println(str);
            }
        }
        catch (IOException e){}
        finally {
            try{
                serverSocket.close();
            }catch (Exception e){}
        }
    }
}