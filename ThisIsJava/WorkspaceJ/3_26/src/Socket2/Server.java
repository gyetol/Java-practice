package Socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //서버 소켓을 생성하고 포트에 바인드

        ServerSocket sSock = null;
        BufferedReader in =null;
        try {
            sSock = new ServerSocket(9000);
            System.out.println("서버가 9000번 포트로 대기중입니다.");

            //클라이언트 접속을 수락
            Socket cSock = sSock.accept();
            InetAddress cInet = cSock.getInetAddress();
            System.out.println(cInet.getHostName() + "가 접속하였습니다.");

            //클라이언트와 데이터를 송수신
            in=new BufferedReader(new InputStreamReader(cSock.getInputStream()));

            while (true) {
                String str=in.readLine();
                System.out.println(str);
                if(str.toUpperCase().equals("BYE")||str.toUpperCase().equals("NULL")){
                    System.out.println(cInet.getHostName()+"와의 연결이 종료되었습니다.");
                    break;}
            }
        } catch (IOException e) { }
        //서버 소켓을 닫습니다.
        finally {
            try{
                sSock.close();
            }catch (Exception e){}
        }
    }
}
