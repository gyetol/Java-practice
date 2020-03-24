package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppStart2 {
    public static void main(String[] args) {
        HashMap<MyKey,MyValue> hm= new HashMap<>();
        hm.put(new MyKey(1),new MyValue("홍길동"));
        hm.put(new MyKey(2),new MyValue("홍길동"));
        hm.put(new MyKey(3),new MyValue("심청이"));
        hm.put(new MyKey(3),new MyValue("홍길동")); // 3번째와 4번째의 키를 다른키로 봤다는 것이다.

        //키가 있는가 없는가를 판단할때, equals로 일단 같은 키가 있는지 보고, 만약 equals가 같다면, hashcode의 값을 비교한다.
        //그래서 equals랑 hashcode 둘다 구현해야한다. (해쉬계열을 쓸 때 주의점)


        hm.remove(new MyValue("홍길동"));
        hm.remove(new MyKey(3));

        Set<Map.Entry<MyKey,MyValue>> entrySet= hm.entrySet();
        Iterator<Map.Entry<MyKey,MyValue>> it = entrySet.iterator();
        while(it.hasNext())
        {
            Map.Entry<MyKey,MyValue> entry = it.next();
            System.out.println(entry.getKey().getKey()+" : "+entry.getValue().getValue());
        }




    }
}
