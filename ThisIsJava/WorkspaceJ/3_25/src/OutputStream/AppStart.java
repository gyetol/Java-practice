package OutputStream;

import java.io.*;

public class AppStart {
    public static void main(String[] args) {
        FileOutputStream fos = null; //파일아웃풋스트림은 파일에 쓰는 일을 한다.
        DataOutputStream dos=null;
        try {
            fos = new FileOutputStream("C:/temp/data.txt");
            dos= new DataOutputStream(fos); //데이터아웃풋스트림이 fos를 포장함으로써 파일아웃풋스트림이 가지지 못했던 기능들을 쓸수 있다(데코레이터)
            dos.writeInt(300);
            dos.writeDouble(3.14);
            dos.writeChar('A');
            dos.writeChars("수요일");

            fos.write(65);
            fos.write(166); //바이트단위를 넘어서는 값을 입력함
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
               // fos.close();
                dos.close();//오토클로즈에이블(자기가 가지고 있는 닫음)과 클로즈에이블(자기를 닫음)을 둘다 implement했다.
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
}

class MyOutputStream implements Closeable,AutoCloseable{
    OutputStream os;

    public void close(){
        try{
            os.close(); //자기가 가지고 있는거 닫는다(오토클로즈에이블)
        }catch (IOException e){}

        this.close(); //자기를 닫는다(클로즈에이블)
    }
}
