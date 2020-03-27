package Chatting_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiver implements Runnable {
    private BufferedReader socketIn;

    public ClientReceiver(Socket socket) throws Exception{
        socketIn= new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {

        try {
            while (true) {
                String str = socketIn.readLine();
                System.out.println("서버: " + str);
                if (str.toLowerCase().equals("bye")) {
                    break;
                }
            }
        }catch (IOException e){}
        finally {
            try{
                socketIn.close();
            }
            catch (Exception e){}
        }
    }
}
