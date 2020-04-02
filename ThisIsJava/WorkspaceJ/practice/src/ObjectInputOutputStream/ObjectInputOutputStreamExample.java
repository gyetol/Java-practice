package ObjectInputOutputStream;

import java.io.*;

class Person implements Serializable {
    //static final long serialVersionUID = 11;
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "우헤헤";
    }
}

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("C:/temp/Object.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);

        oos.writeObject(new Integer(10));
        oos.writeObject(new Double(3.14));
        oos.writeObject(new int[] {1,2,3});
        oos.writeObject(new Person("하하",39));
        oos.flush(); oos.close();fos.close();

        FileInputStream fis=new FileInputStream("C:/temp/Object.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Integer obj1=(Integer)ois.readObject();
        Double obj2=(Double)ois.readObject();
        int[] obj3=(int[])ois.readObject();
        String obj4=(String)ois.readObject();

        ois.close(); fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
      //  System.out.println(obj4);
    }

}
