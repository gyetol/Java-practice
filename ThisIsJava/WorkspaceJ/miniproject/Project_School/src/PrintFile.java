import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrintFile implements Printable {
    private ObjectOutputStream writer;
    String filename;

    public PrintFile(ObjectOutputStream writer,String filename)
    {
        this.writer=writer;
        this.filename=filename;
    }

    @Override
    public void print(List list) {

    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<Student>();
        students.add(new Student("김이나",20128585,"작사학과",88));
        students.add(new Student("김재호",20184545,"작곡학과",85));
        students.add(new Student("노유타",20148465,"모델학과",97));

        FileOutputStream fw= null;
        ObjectOutputStream oos =null;
        FileInputStream fwi=null;
        ObjectInputStream ois=null;

        try {
            fw = new FileOutputStream("C:/temp/data1.txt");
            oos = new ObjectOutputStream(fw);
        }catch(IOException e){
            System.out.println("파일 읽기 실패");
        }
        Iterator<Student> it =students.iterator();
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


        try{
            fwi= new FileInputStream("C:/temp/data1.txt");
            ois= new ObjectInputStream(fwi);
        }catch (IOException e){
            System.out.println("파일 읽기 실패");
        }
        Iterator<Student> it1=students.iterator();
        while(it1.hasNext())
        {
            Object o =null;
            try {
                o = ois.readObject();
            }catch (IOException | ClassNotFoundException e)
            {
                System.out.println("다 읽었음");
                break;
            }
            System.out.println((Student)o);
        }


    }

}
