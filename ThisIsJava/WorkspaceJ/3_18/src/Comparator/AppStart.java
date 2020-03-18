package Comparator;
import java.util.Comparator;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b){
        return (a-b);
    }
}

public class AppStart{
    public static void main(String[] args) {
        /*int a=10;
        int b=5;
        int c= Objects.compare(a,b,new Comparator<Integer>(){ //new MyComparator()
            public int compare(Integer a,Integer b){
                return (a-b);
            }
                }
        );*/
        System.out.println(System.getProperty("os.name"));

        Map<String,String> env = System.getenv();
        System.out.println(env.get("Path"));



        Set<String> keys = env.keySet();
        Iterator<String> keyIt= keys.iterator();
        while(keyIt.hasNext()){
            String k = keyIt.next();
            System.out.println(k+"----------------------------");
            String value=env.get(k);
            System.out.println(value);
        }
    }
}
