package FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReaderTest {
    public static void main(String[] args) {
        BufferedReader in =null;
        try{
            in =new BufferedReader(new FileReader("C:/temp/data.txt"),1024);
            while(true){
                String line= in.readLine();
                if(line==null){break;}
                //System.out.println(line);
                StringTokenizer st = new StringTokenizer(line,":");

                try {
                    if (st.countTokens() != 2) {
                       throw new Exception();
                    } else {
                        String name = st.nextToken();
                        int age = Integer.parseInt(st.nextToken());
                        System.out.println("이름:"+name+", 나이:"+age);
                    }
                }catch (NumberFormatException e){
                    System.out.println("데이터 변환중에 문제 발생");
                }
                catch (Exception e){
                    System.out.println("데이터에 문제가 발생");
                }
               /* while(st.hasMoreTokens())
                {
                    System.out.println(st.nextToken(":"));
                }*/
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                in.close();
            }catch(Exception e){ }
        }
    }
}
