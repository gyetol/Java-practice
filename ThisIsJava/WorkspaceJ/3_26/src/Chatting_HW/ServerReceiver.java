package Chatting_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiver implements Runnable{
    private BufferedReader clientSocketIn;

    public ServerReceiver(Socket clientSocket) throws Exception {
        clientSocketIn= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    @Override
    public void run() {
        try{
            while(true) {
                String str = clientSocketIn.readLine();
                System.out.println("손님: " + str);
                if(str.toLowerCase().equals("bye")){
                    break;
                }
            }
        }
        catch (IOException e){ }
       finally {
            try {
                clientSocketIn.close();
            }
            catch (Exception e){}
        }
    }
}
