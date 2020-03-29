package Chatting_HW;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private BufferedReader consoleIn;
    private PrintWriter clientSocketOut;
//    private int port;
    private ServerReceiver serverReceiver;

    public Server(int port){
        try {
//            this.port = port;
            serverSocket = new ServerSocket(port);

            System.out.println("8000번포트로 서버를 구동하였습니다.");
        }catch (Exception e){
            System.out.println("서버소켓 생성 실패");
        }
    }
    public void serverStart(){
        try {
            Socket socket = serverSocket.accept();
            serverReceiver = new ServerReceiver(socket);
            consoleIn = new BufferedReader(new InputStreamReader(System.in));
            clientSocketOut = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            Thread serverReceiveThread = new Thread(serverReceiver);
            serverReceiveThread.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server= new Server(8000);
        server.serverStart();

        try{
            while(true)
            {
                String str=server.consoleIn.readLine();
                server.clientSocketOut.println(str);
                server.clientSocketOut.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                server.serverSocket.close();
            }catch (Exception e){}
        }
    }
}
