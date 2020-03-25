package InputStream;

import java.io.*;

public class AppStart {
    public static void main(String[] args) {
        File f =null;
        FileInputStream fis=null;
        DataInputStream dis=null;

        try{
            f=new File("C:/temp/data.txt");
            fis= new FileInputStream(f);
            dis=new DataInputStream(fis);
            int i= dis.readInt();
            double d =dis.readDouble();
            char c = dis.readChar();

          byte[] str = new byte[100];
          dis.read(str);
            System.out.println(new String (str,"CP949"));


            System.out.println(i);
            System.out.println(d);
            System.out.println(c);
           // System.out.println(s);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (EOFException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                dis.close();
            }
            catch(Exception o){}
        }
    }
}
