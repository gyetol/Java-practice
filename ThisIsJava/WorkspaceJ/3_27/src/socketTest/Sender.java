package socketTest;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sender {
    public static final char STX ='\u0002';
    public static final char ETX ='\u0003';
    public static final char EOT ='\u0004';

    //java Sender [서버주소] 포트번호
    public static void main(String[] args) {

        if(!(args.length==1 || args.length==2)){
            System.err.println("잘못된 명령행입니다");
            System.err.println("사용법> java Sender [서버주소] 포트번호");
            System.exit(1);
        }
        int portNumber=0;
        int posPort=0;
        InetAddress ia=InetAddress.getLoopbackAddress();
        if(args.length==2)
        {
            try{
                ia=InetAddress.getByName(args[0]);
            }catch (UnknownHostException e){
                System.err.println(args[0]+"호스트를 찾을수 없습니다.");
                System.exit(2);
            }
            posPort++;
        }
        try{
            portNumber= Integer.parseInt(args[posPort]);
            if(portNumber<1 || portNumber >65535){
                System.err.println("잘못된 포트번호입니다.");
                System.err.println("지정가능한 포트번호는[1~65535]입니다.");
                System.exit(4);
            }
        }
        catch (NumberFormatException e){
            System.err.println("잘못된 포트");
            System.exit(3);
        }


        Socket socket = null;
        OutputStream out=null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            socket = new Socket(ia,portNumber);
            System.out.println(ia.getHostName()+"서버에 접속하였습니다.");
            out = socket.getOutputStream();

            while(true){
                StringBuffer sb= new StringBuffer(128);
                sb.append('\u0002');  // sb.append(Character.toChars(2)); sb.append(Character.toChars(0x02));
                // sb.append(Character.toChars(0x1C)); file saparater
                System.out.println("제품코드 : "); //10자리
                String code =in.readLine();
                code = code.substring(0,(code.length()<10)?code.length():10).toUpperCase();
                code=String.format("%10s",code);
                sb.append(code);

                while(true) {
                    try {
                        System.out.println("제품수량 : "); //4자리
                        String str = in.readLine();
                        int num = Integer.parseInt(str);
                        if(num<1 ||num>9999){
                            throw new Exception("수량을 잘못 입력하였습니다. 수량은 1~9999까지 입력가능");
                        }

                        sb.append(String.format("%4d",num));
                        break;
                    }catch(NumberFormatException e){
                        System.err.println("잘못입력하셨습니다.");
                    }
                    catch (Exception e){
                        System.err.println(e.getMessage()); //new할때 주어진 메시지를 출력
                    }
                }
                while(true) {
                    try {
                        System.out.println("제품가격 : "); //10자리
                        String str = in.readLine();
                        int price = Integer.parseInt(str);
                        if(price<0 || price>Integer.MAX_VALUE){
                            throw new Exception("가격을 잘못입력하였습니다. 가격은 0~"+Integer.MAX_VALUE+"까지 입력이 가능합니다.");
                        }
                        sb.append(price);
                        break;
                    }
                    catch (NumberFormatException e){
                        System.err.println("잘못입력하셨습니다.");
                    }
                    catch (Exception e){
                        System.err.println(e.getMessage());
                    }
                }
                sb.append('\u0003');
                out.write(sb.toString().getBytes());

                System.out.println("계속 전송하시겠습니까(y/n)?");
                String str=in.readLine();
                if(str.trim().toLowerCase().equals("n")){
                    //서버에 송신종료를 나타내는 의미로서 EOT를 전송
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                socket.close();
            }
            catch (Exception e){}
        }
    }
}
