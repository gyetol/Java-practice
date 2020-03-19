package ArraysTest2;

import java.util.Arrays;

public class AppStart {
    public static void main(String args[]){
        Person[] persons = {
                new Person("홍길동",100,80),
                new Person("이순신",90,95),
                new Person("심청이",96,98),
                new Person("에디슨",100,99)
        };

        Arrays.sort(persons);
        for(Person p:persons){
            System.out.println(p);
        }
    }
}
