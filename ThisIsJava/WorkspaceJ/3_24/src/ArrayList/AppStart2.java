package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class AppStart2 {
    public static void main(String[] args) {
        /*ArrayList al=new ArrayList(3); //타입을 명시하지 않았으므로 Object타입이 되었다.*/
        LinkedList<Person> persons =new LinkedList<>();

        persons.add(0,new Person("홍길동"));
        persons.add(0,new Person("심청이"));
        persons.add(0,new Person("이순신"));

     /*   Iterator<Person> it = persons.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

    /* for(int i=0;i<persons.size();i++) //이순신이 지워지는 순간, 심청이가 0번방으로 들어간다. 근데 i가 하나 증가하므로 심청이 삭제 안됌
     {
       Person rp=  persons.remove(i);
         System.out.println(rp+"객체를 삭제");
     }*/

    while(!persons.isEmpty()){  //더 간단한 방법은 persons.clear();
        Person rp = persons.remove(0);
        System.out.println(rp+" 객체 삭제");
    }

    }
}
