package Chatting_HW;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    private BufferedReader consoleIn;
    private PrintWriter serverOut;
    private ClientReceiver clientReceiver;
    private String serverName;
    private int serverPort;

    public Client(String serverName,int serverPort){
        try{
            this.serverName=serverName;
            this.serverPort=serverPort;
            socket= new Socket(serverName,serverPort);
            this.clientReceiver = new ClientReceiver(socket);
            System.out.println("127.0.0.1서버에 접속 성공");
        }
        catch (Exception e){
            System.out.println("클라이언트 소켓 생성 실패");
            e.printStackTrace();
        }
    }

    public void clientStart(){
        try {
            consoleIn = new BufferedReader(new InputStreamReader(System.in));
            serverOut = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

        }catch (Exception e){
            e.printStackTrace();
        }
       Thread clientReceiveThread = new Thread(clientReceiver);
        clientReceiveThread.start();
    }

    public static void main(String[] args) {
       Client client =new Client("127.0.0.1",8000);
       client.clientStart();
       try {
           while (true) {
               String str = client.consoleIn.readLine();
               client.serverOut.println(str);
               client.serverOut.flush();
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       finally {
           try{
               client.socket.close();
           }catch (Exception e){}
       }
    }
}
