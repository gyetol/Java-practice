package ManToMan;

import java.io.*;
import java.net.Socket;

public class Client {

    Socket sock = null;
    BufferedReader cin = null;
    PrintWriter sout = null;
    BufferedReader sin = null;

        class Receiver extends Thread {
            @Override
            public void run() {
                try {
                    while (true) {
                        String recvMessage = sin.readLine();
                        System.out.println(recvMessage);
                        if(recvMessage.toUpperCase().equals("BYE")){
                            break;
                        }
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    public void start() {
            Thread t=null;
        try {
            sock = new Socket("127.0.0.1", 9000);
            System.out.println("127.0.0.1서버 접속에 성공하였습니다.");
            cin=new BufferedReader(new InputStreamReader(System.in));
            sout=new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
            sin=new BufferedReader(new InputStreamReader(sock.getInputStream()));
            t=new Receiver();
            t.start(); //스레드 구동

            while(true){
                String sendMessage = cin.readLine();
                System.out.println(sendMessage);
                sout.flush();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                t.interrupt();
                sock.close();
            }catch (Exception e){}
        }
    }

    public static void main(String[] args) {
            Client client=new Client();
            client.start(); //run을 실행하는 것이 아니라 메소드를 실행하는 것이다.
    }
}
