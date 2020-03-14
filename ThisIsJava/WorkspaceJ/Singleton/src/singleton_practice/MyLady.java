package singleton_practice;

public class MyLady {
    private static MyLady instance=null;

    private String name;
    private int age;
    private String phoneNum;

    private MyLady(){

    }

    private MyLady(String name,int age,String phoneNum){
        this.name=name;
        this.age=age;
        this.phoneNum=phoneNum;
    }

    public static MyLady getInstance(String name,int age,String phoneNum){
        if(instance==null){
            instance = new MyLady(name,age,phoneNum);
        }
        return instance;
    }

   public static MyLady getInstance(){
       if(instance==null){
           instance= new MyLady();
       }
       return instance;
   }
   public String toString(){
        return "그녀 : "+ name+" "+age+" "+phoneNum;
   }
}
