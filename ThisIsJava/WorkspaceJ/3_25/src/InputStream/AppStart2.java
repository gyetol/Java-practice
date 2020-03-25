package InputStream;

import java.io.*;

public class AppStart2 {
    public static void main(String[] args) {
     File f=null;
     FileInputStream fis=null;
     ObjectInputStream ois=null;

     try{
         f=new File("C:/temp/data.txt");
         fis=new FileInputStream(f);
         ois=new ObjectInputStream(fis);

         int i= ois.read();
         double d = ois.readDouble();
         char c =ois.readChar();

         System.out.println(i);
         System.out.println(d);
         System.out.println(c);
     }
     catch(FileNotFoundException e){
         e.printStackTrace();
     }
     catch (IOException e){
         e.printStackTrace();
     }
     finally{
        try {
            ois.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
     }


    }
}
