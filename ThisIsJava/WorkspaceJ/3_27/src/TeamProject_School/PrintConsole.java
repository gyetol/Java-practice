package TeamProject_School;

import java.util.Iterator;
import java.util.List;

public class PrintConsole implements Printable {
    @Override
    public void print(List<Student> list) {

        String str=null;
        Iterator<Student> it= list.iterator();
        while(it.hasNext()){
            str=it.next().toString();
            System.out.println(str);
        }
    }
}