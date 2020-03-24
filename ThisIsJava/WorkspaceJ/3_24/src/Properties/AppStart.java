package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class AppStart {
    public static void main(String[] args) {
        Properties config = new Properties();
        FileReader fr=null;
        try{
           fr=new FileReader("data.txt");
           config.load(fr);

            Enumeration<String> names= (Enumeration<String>)config.propertyNames();
            while(names.hasMoreElements())
            {
                String key=names.nextElement();
                System.out.println(key+" : "+config.getProperty(key));
            }
            System.out.println(config.getProperty("email"));
        }
        catch(FileNotFoundException e){ //catch는 하위형을 먼저 해야한다.
            System.out.println("지정한 파일을 찾을 수 없습니다.");
        }
        catch (IOException e){
            System.out.println("파일을 읽는 도중 문제 발생하였습니다.");
        }
        finally {

        }
    }
}
