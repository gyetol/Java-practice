 package pack1;

public class MyLady{
    private  static MyLady instance= null;
    private MyLady(){

    }

    public static MyLady getInstance(){
        if(instance==null){
            instance=new MyLady();
        }
        return instance;
    }

    public String toString(){
        return "나의 하나뿐인 그대";
    }
}
