package Socket2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //클라이언트 소켓을 생성
        Socket sock = null;
        PrintWriter sout = null;
        BufferedReader cin = null;

        try {
            sock = new Socket("127.0.0.1", 9000); //포트번호를 미리지정해서 만들면 connect가 저절로 된다.
            System.out.println("127.0.0.1서버에 접속하였습니다.");
            sout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
            cin=new BufferedReader(new InputStreamReader(System.in));

            while(true)
            {
                String str=cin.readLine();
                sout.println(str);
                sout.flush();

                if(str.toUpperCase().equals("BYE")){
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                sock.close();
            }catch (Exception e){}
        }

    }}
