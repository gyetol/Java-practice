package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppStart {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"홍길동");
        hm.put(2,"심청이");
        hm.put(3,"이순신");
        hm.put(3,"강감찬");

        Set<Integer> keys=  hm.keySet();
        Iterator<Integer> keyIterator = keys.iterator();

        Integer key=null;
        String value=null;

     /*   if(hm.containsKey(2)){
            hm.remove(2);
        }*/ //2번 삭제

       /* String str=hm.get(2);
        if(str!=null){
            hm.remove(str);
        }*/ //2번삭제


        while(keyIterator.hasNext()){
           /* System.out.println(keyIterator.next()); //next()를 호출하게 되면 커서가 넘어가므로 아래 코드를 붙이면 안된다.
            System.out.println(hm.get(keyIterator.next()));*/
           int i =keyIterator.next();
          /*  System.out.println("키 값 : "+i);
            System.out.println(hm.get(i));*/
          //hm.remove(i);
            if(i==2){
                key=i;
                value=hm.get(i);
            }
        }
        if(key!=null)
        {
            hm.remove(key,value);
        } //2번삭제


        Set<Map.Entry<Integer,String>> entrySet =hm.entrySet();
        Iterator<Map.Entry<Integer,String>> entryIterator= entrySet.iterator();
        while(entryIterator.hasNext())
        {
            Map.Entry<Integer,String> entry= entryIterator.next();
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }

        if(hm.containsKey(1)){
            System.out.println(hm.get(1));
        }
        else{
            System.out.println("키가 1인 엔트리는 없습니다.");
        }


        if(hm.containsKey(4)){
            System.out.println(hm.get(4));
        }
        else{
            System.out.println("키가 4인 엔트리는 없습니다.");
        }

      //  String value=hm.get(4);
        if(value!=null){
            System.out.println(value);
        }
        else{
            System.out.println("객체 추출에 실패하였습니다.");
        }
    }
}
