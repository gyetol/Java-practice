package ObjectOutputStream;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class School {
    HashSet<Person> school;

    public School(){
        school=new HashSet<>();
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
        System.out.println("파일에 저장합니다.");

        ObjectOutputStream out =null;
        try{
            out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName),2048));
            Iterator<Person> it = this.school.iterator();
            while(it.hasNext()){
                out.writeObject(it.next());
            }
            out.flush();
            System.out.println("객체 저장을 완료하였습니다.");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                out.close();
            }catch (Exception e){}
        }


        /*File file= new File(fileName);
        FileInputStream fis= null;
        BufferedInputStream bis =null;
        ObjectInputStream ois=null;
        try{
            fis=new FileInputStream(fileName);
            bis =new BufferedInputStream(fis);
            ois=new ObjectInputStream(bis);

            Iterator<Person> it= school.iterator();
            while(it.hasNext())
            {
               // Person p=(Person)ois.readObject();
                Person p=(Person)it.next();
                System.out.println(p);
                ois.wObject();
            }

        }
       catch (Exception e){
            e.printStackTrace();
       }
        finally {
            try{
                bis.close();
            }catch (Exception e){}
        }*/ //짜다가 실패한 코드


    }
    public void restoreFile(String fileName){
        System.out.println("파일로부터 읽어들입니다.");

        ObjectInputStream in =null;

        try{
            in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName),2048));
            while(true){
                try{
                    Object obj = in.readObject();
                    if(obj!=null){
                        school.add((Person)obj);
                    }
                }
                catch(EOFException e){
                    System.out.println("모든 데이터를 읽어들였습니다.");
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                in.close();
            }catch (Exception e){}
        }

    }

}
