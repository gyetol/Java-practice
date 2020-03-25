package Buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BufferedOut {
    public static void main(String[] args) {
        ObjectOutputStream ois=null;

        try{
            ois=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/temp/data.txt"),1024));
            ois.writeInt(10);
            ois.writeDouble(3.14);
            ois.writeObject("홍길동");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                ois.close(); //자동으로 flush를 한다
            }catch (Exception e){}
        }


    }
}
