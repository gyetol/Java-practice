package FileWriter_practice;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {
        List<Person> students = new LinkedList<>();
        students.add(new Person("홍길동",20));
        students.add(new Person("심청이",16));
        students.add(new Person("이순신",50));

        PrintWriter fw= null;

        try{
            fw=new PrintWriter("C:/temp/data.txt");
            for(Person p : students)
            {
                fw.printf("%s ~ %d",p.getName(),p.getAge());

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                fw.close();
            }catch (Exception e){}

        }
    }
}
