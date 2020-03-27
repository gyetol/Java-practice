package Socket2_practice;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        //서버 소켓을 생성하고 포트에 바인드
        ServerSocket serverSocket = null;
        try{
            serverSocket= new ServerSocket(5000);
            System.out.println("서버가 5000번포트에서 접속을 기다리고 있습니다");

            //클라이언트 접속을 수락
            serverSocket.accept();

            //클라이언트와 데이터를 송수신
            //서버 소켓을 닫습니다.
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }

}
