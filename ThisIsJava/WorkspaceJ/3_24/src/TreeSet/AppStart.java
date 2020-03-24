package TreeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AppStart {
    public static void main(String[] args) {
       /* TreeSet<Integer> ts= new TreeSet<>();

               ts.add(30);
        ts.add(10);
        ts.add(15);
        ts.add(20);
        ts.add(25);

        for(Integer i : ts){
            System.out.println(i); //중위순회방식으로 출력, 부모가 가운데, 좌측이 없으면 자기 출력, 좌측보고 나서 우측 봄
        }*/

       /* TreeSet<String> ts= new TreeSet<>();
        ts.add("홍길동");
        ts.add("심청이");
        ts.add("이순신");
        ts.add("고길동");
        ts.add("강감찬");

        for(String i : ts){
            System.out.println(i);
        }*/

        TreeSet<Person> ts= new TreeSet<>(new PersonComparator());
        ts.add(new Person("홍길동",100,90,90));
        ts.add(new Person("이순신",90,90,90));
        ts.add(new Person("심청이",85,90,99));
        ts.add(new Person("고길동",88,79,100));
        ts.add(new Person("강감찬",90,95,100));

        System.out.println("----------------------------------");
        for(Person i : ts){
            System.out.println(i);
        }

        System.out.println("----------------------------------");
        NavigableSet<Person> ns = ts.descendingSet();
        for(Person p : ns){
            System.out.println(p);
        }

        System.out.println("----------------------------------");
        NavigableSet<Person> ns2= ns.descendingSet();
        for(Person p : ns2){
            System.out.println(p);
        }
        System.out.println("----------------------------------");
        Iterator<Person> it = ts.descendingIterator(); //compareTo를 건드려서 내림차순으로 되어있으면 오름차순으로 반환한다.
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
