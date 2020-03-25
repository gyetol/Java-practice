/*
package Pattern_ObjectInOutstream;

import java.io.*;
import java.util.Iterator;
import java.util.Set;

public class FileAccess implements Accessable {
    @Override
    public void saveSchool(School school, String fileName) throws Exception {
        ObjectOutputStream out =null;
        try{
            out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName),2048));
            Iterator<Person> it = school.getSchool().iterator();
            while(it.hasNext()){
                out.writeObject(it.next());
            }
            out.flush();
            System.out.println("객체 저장을 완료하였습니다.");

        }
        catch (Exception e){
            e.printStackTrace();
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
            in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName),2048));
            while(true){
                try{
                    Object obj = in.readObject();
                    if(obj!=null){
                        ((Set<Person>)school.add((Person)obj);
                    }
                }
                catch(EOFException e){
                    System.out.println("모든 데이터를 읽어들였습니다.");
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                in.close();
            }catch (Exception e){}
        }
    }
}
*/
