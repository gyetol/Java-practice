package Pattern_ObjectInOutstream;

import java.io.*;
import java.util.Iterator;
import java.util.Set;

public class FileAccess2 implements Accessable{
    public static final int BUFFER_SIZE=1024;

    @Override
    public void saveSchool(School school, String fileName) throws Exception {
        ObjectOutputStream out =null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName), BUFFER_SIZE));
            Set<Person> persons = school.getSchool();
            Iterator<Person> it =persons.iterator();
            while(it.hasNext()){
                out.writeObject(it.next());
            }
            out.flush();

        }catch (Exception e){
            throw e;
        }
        finally {
            try{
                out.close();
            }catch (Exception e){}
        }
    }

    @Override
    public void restoreSchool(School school, String fileName) throws Exception {
        ObjectInputStream in =null;

        try{
            in =new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName),BUFFER_SIZE));
            while(true)
            {
                try{
                    Object obj=in.readObject();
                    school.addPerson((Person)obj);
                }
                catch (EOFException e){
                    break;
                }
            }
        }
        catch (Exception e){
            throw e;
        }
        finally {
            try{
                in.close();
            }
            catch (Exception e){}
        }
    }
}
