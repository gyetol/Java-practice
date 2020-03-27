package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class AppStart {
    public static void main(String[] args) {
   /*   try {
            InetAddress ia = InetAddress.getLocalHost(); //무조건 자기자신이라 예외발생안함
            System.out.println(ia.getHostAddress());
            System.out.println(ia.getHostName());
        }catch (UnknownHostException e){
            System.out.println("로컬호스트 검색에 실패");
        }*/
   /*  try{
         InetAddress ia=InetAddress.getByName("www.google.com");
        byte[] addr=ia.getAddress();
        for(int i=0;i<addr.length;i++){
            if(i>0){ //i가 0일때는 안돌아가니까 마지막에 안찍혀서 좋다 이거 출력포맷할때 좋을듯
                System.out.printf(".");
            }
            System.out.print(Byte.toUnsignedInt(addr[i]));
        }
     }catch (UnknownHostException e){}
*/

   try{
       InetAddress[] ias=InetAddress.getAllByName("www.naver.com");
       for(InetAddress ia : ias){
           System.out.println(ia.getHostAddress());
       }
   }catch (UnknownHostException e){}

    }
}
