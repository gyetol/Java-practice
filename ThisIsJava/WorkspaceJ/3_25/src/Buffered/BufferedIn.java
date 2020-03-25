package Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class BufferedIn {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        MyBufferedInputStream bis=null;


        try{
            bis=new MyBufferedInputStream(new FileInputStream("C:/temp/data.txt"),512); //file만 sink stream //파일 이름대신에 System.out인가 써도 되더라
            ois=new ObjectInputStream(bis); //processing stream

            byte[] buf=bis.getBuffer();
            System.out.println(Arrays.toString(buf));

            int i=ois.readInt();
            double d=ois.readDouble();
            String s=(String)ois.readObject();

            System.out.println(i);
            System.out.println(d);
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                ois.close();
            }catch (Exception e){}
        }
    }
}
