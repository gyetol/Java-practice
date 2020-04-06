import java.io.*;
import java.util.Iterator;
import java.util.List;

public class PrintFile implements Printable {
    String filename;

    public PrintFile(){
        filename="C:/temp/data.txt";
    }
    public PrintFile(String filename)
    {
        this.filename=filename;
    }

    @Override
    public void print(List list) {

        if(list==null){
            System.out.println("출력할 목록을 지정해주세요");
            return;
        }

        FileOutputStream fw= null;
        ObjectOutputStream oos =null;

        try {
            fw = new FileOutputStream(this.filename);
            oos = new ObjectOutputStream(fw);
        }catch(IOException e){
            System.out.println("파일 읽기 실패");
        }
        Iterator<Student> it =list.iterator();
        while(it.hasNext())
        {
            try {
                oos.writeObject(it.next());
                oos.flush();
            }
            catch(IOException e){
                System.out.println("파일 쓰기 실패");
                break;
            }
        }
    }
}
