package ThreadPractice2;

import java.util.HashSet;
import java.util.Iterator;

public class Bakery {
    private HashSet<String> warmmer;

    public Bakery(){
        warmmer= new HashSet<>();
    }

    public synchronized void add(String bread){
        warmmer.add(bread);
    }

    public String getBread(){ //이 메소드를 동기화해도 된다
        String bread=null;
        Iterator<String> it= warmmer.iterator();

        if(warmmer.size()>0){
                if(it.hasNext())
                {
                    bread=it.next();
                    warmmer.remove(bread);
                }

        }
        return bread;
    }
}
