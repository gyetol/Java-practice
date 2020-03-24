package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class AppStart {
    public static void main(String[] args){
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("홍길동"));
        hs.add(new Person("심청이"));
        hs.add(new Person("이순신"));
        hs.add(new Person("을지문덕"));
        hs.add(new Person("에디슨"));

        Iterator<Person> it = hs.iterator();
        //hs.remove(new Person("홍길동"));
        String name="홍길동";

        Person d=null;
        while(it.hasNext()){
         Person  p=it.next();
            if(p.getName().equals(name)){
                d=p;
                break;
            }
        }
       if( hs.remove(d))
       {
           System.out.println("삭제 성공");
       }
       else{
           System.out.println("삭제 실패");
       }

        it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //System.out.println(new Person("이순신").equals(new Person("이순신")));

        }
    }

