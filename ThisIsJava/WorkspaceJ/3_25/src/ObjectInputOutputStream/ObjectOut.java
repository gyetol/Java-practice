package ObjectInputOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOut {
    public static void main(String[] args) {
        ObjectFile file =null;
        ObjectOutputStream oos =null;

        try{
            file= new ObjectFile("C:/temp/data.txt");
            oos= new ObjectOutputStream(new FileOutputStream(file)); //File을 상속했으므로 ObjectFile도 File이 될 수 있다. 그래서 getFile()안써도 된다

            oos.writeInt(100);
            oos.writeDouble(3.14);
            oos.writeChar('A');
            oos.writeObject("자바");
            oos.writeObject(new Person("홍길동",20));
            System.out.println("파일쓰기를 완료하였습니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
            }catch (Exception e){}
        }
    }
}
