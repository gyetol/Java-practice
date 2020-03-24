package TreeMap;

import java.util.*;

public class AppStart {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "이순신");
        map.put(90, "홍길동");
        map.put(95, "심청이");
        map.put(93, "강감찬");

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> keyIt = keySet.iterator();
        while (keyIt.hasNext()) {
            int key = keyIt.next();
            System.out.println(map.get(key) + " : " + key);
        }

        NavigableSet<Integer> ns = map.descendingKeySet();
        Iterator<Integer> nIter=ns.iterator();
        while(nIter.hasNext()){
            int key=nIter.next();
            System.out.println(map.get(key)+" : "+key);
        }
        for (Integer p : ns) {
            System.out.println(p);
        }

        NavigableMap<Integer,String> nMap=map.descendingMap();
        Set<Integer> keys2 = nMap.keySet();
        Iterator<Integer> nIter2=keys2.iterator();
        while(nIter2.hasNext()){
            int key=nIter2.next();
            System.out.println(nMap.get(key)+" : " + key);
        }

    }
}
