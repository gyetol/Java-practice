package ManToMan;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class ServerReceiver implements Runnable {
    BufferedReader sin;

    public ServerReceiver(Socket sock) throws Exception {
        this.sin = new BufferedReader(new InputStreamReader(sock.getInputStream()));
    }

    @Override
    public void run() {
        try {
            while (true) {
                String recvMessage = sin.readLine();
                System.out.println(recvMessage);
                if(recvMessage.toUpperCase().equals("BYE")||recvMessage.toUpperCase().equals("NULL")){
                    System.out.println("연결이 종료되었습니다.");
                    break;}
                try {
                    Thread.sleep(1);
                }catch (InterruptedException e){break;}
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


public class Server {
    public static void main(String[] args) {
        ServerSocket sSock=null;
        BufferedReader cin=null;
        PrintWriter sout=null;
        Thread receiver=null;
        try{
            sSock=new ServerSocket(9000);
            System.out.println("9000번포트로 서버를 구동하였습니다.");
            Socket cSock=sSock.accept();
            System.out.println(cSock.getInetAddress().getHostName()+"호스트가 접속하였습니다");
            receiver = new Thread(new ServerReceiver(cSock));
            receiver.start();
            cin =new BufferedReader(new InputStreamReader(System.in));
            sout=new PrintWriter(new BufferedWriter(new OutputStreamWriter(cSock.getOutputStream())));

            while(true)
            {
                String sendMessage =cin.readLine();
                sout.println(sendMessage);
                sout.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            receiver.interrupt();
            try{
                sSock.close();
            }catch (Exception e){}
        }
    }

}
