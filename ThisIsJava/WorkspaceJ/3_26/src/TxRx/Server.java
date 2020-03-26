package TxRx;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket sSock=null;
        BufferedReader cin=null;//콘솔입력
        BufferedReader sin=null;//소켓입력
        PrintWriter sout = null;//소켓출력

        try{
            sSock= new ServerSocket(9000);
            System.out.println("9000번 포트가 클라이언트를 기다립니다.");
            cin=new BufferedReader(new InputStreamReader(System.in));

            Socket cSock=sSock.accept();
            InetAddress client = cSock.getInetAddress();
            System.out.println(client.getHostName()+"가 연결되었습니다.");

            sin=new BufferedReader(new InputStreamReader(cSock.getInputStream()));
            sout=new PrintWriter(new BufferedWriter(new OutputStreamWriter(cSock.getOutputStream())));

            while(true){
                String str=sin.readLine();
                System.out.println(str);
                System.out.println("전송메시지 : ");
                String sendStr = cin.readLine();
                sout.println(sendStr);
                sout.flush();
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                    sSock.close();
            }catch (Exception e){}
        }
    }
}
