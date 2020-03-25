package ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectIn {
    public static void main(String[] args) {
        ObjectFile file=null;
        ObjectInputStream ois=null;

        try{
            file=new ObjectFile("C:/temp/data.txt");
            ois=new ObjectInputStream(new FileInputStream(file));
            int i =ois.readInt();
            double d = ois.readDouble();
            char c = ois.readChar();
            String str= (String)ois.readObject();
            Person person = (Person)ois.readObject();

            System.out.println(i);
            System.out.println(d);
            System.out.println(c);
            System.out.println(str);
            System.out.println(person.getName()+" : "+person.getAge());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                ois.close();
            }
            catch (Exception e){}
        }
    }
}
