package FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<Person>();
        students.add(new Person("홍길동",20));
        students.add(new Person("심청이",16));
        students.add(new Person("변사또",30));

        FileWriter fw=null;
        PrintWriter out=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter("C:temp/data.txt");
           // bw=new BufferedWriter(fw);
            out=new PrintWriter(fw);
            for(Person p: students)
            {
                out.printf("%s:%d\n",p.getName(),p.getAge());
            }
           out.flush();

            /*out.println(100);
            out.println(3.14);
            out.println("Hello");*//*
            out.printf("%d : %f : %s\n",100,3.14,"Hello"); //나중에 String Tokenizer로 :을 기준으로 Parsing하면 된다.*/
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            out.close();
        }
    }
}
