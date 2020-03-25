package Pattern_ObjectInOutstream;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class School {
    private HashSet<Person> school;
    private Accessable accessable;

    public School(){
        school=new HashSet<>();
        this.accessable=null;
    }

    public void setAccessable(Accessable accessable) {
        this.accessable = accessable;
    }

    public void setSchool(Set<Person> school){
        this.school=new HashSet<Person>(school);
    }

    public Set<Person> getSchool() {
        return school;
    }

    public void addPerson(Person person){
        school.add(person);
    }
    public void addPerson(String name,int age){
        school.add(new Person(name,age));
    }
    public Person findPerson(String name){
        Iterator<Person> it= this.school.iterator();
        Person p=null;
        while(it.hasNext()){
            p=it.next();
           if(p.getName().equals(name)){
               return p;
           }
        }
        return p;
    }

    public boolean removePerson(String name)
    {
        return school.remove(findPerson(name));
    }

    public void showList(){
        System.out.println("현재 등록된 학생: "+school.size()+"명");
        Iterator<Person> it =school.iterator();
        while(it.hasNext()){
            Person person = it.next();
            System.out.println(person.getName()+" : "+ person.getAge());
        }
    }

    public void clear(){
        school.clear();
    }

    public void saveFile(String fileName){
        try{
            this.accessable.saveSchool(this,fileName);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public void restoreFile(String fileName){
       try{
           this.accessable.restoreSchool(this,fileName);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
