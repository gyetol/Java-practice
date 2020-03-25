/*
package Pattern_ObjectInOutstream;

import ObjectOutputStream.Person;
import ObjectOutputStream.School;

import java.util.HashSet;

public class AppStart {
    public static void main(String[] args) {
        HashSet<Person> hs =new HashSet<>();
        hs.add(new Person("홍길동",20));
        hs.add(new Person("심청이",16));
        School school =new School();
        school.setSchool(hs);
        school.setAccessable(new FileAccess2());
        school.saveFile("C:/temp/data.txt");
        school.clear();
        school.addPerson("이순신",50);
        school.restoreFile("C:/temp/data.txt");
        school.showList();
    }
}
*/
