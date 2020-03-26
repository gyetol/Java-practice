package TxRx;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket sock=null;
        BufferedReader cin=null;
        PrintWriter sout=null;
        BufferedReader sin=null;

        try{
            sock= new Socket("127.0.0.1",9000);
            System.out.println("127.0.0.1서버에 접속하였습니다.");
            cin=new BufferedReader(new InputStreamReader(System.in));
            sin=new BufferedReader(new InputStreamReader(sock.getInputStream()));
            sout=new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));

            while(true)
            {
                System.out.println("전송메시지: ");
                String str= cin.readLine();
                sout.println(str);
                sout.flush();

                String reply=sin.readLine();
                System.out.println("회신메시지: "+reply);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                sock.close();
            }catch (Exception e){}
        }
    }
}
