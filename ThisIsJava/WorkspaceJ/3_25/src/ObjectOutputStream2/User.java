package ObjectOutputStream2;

import java.util.List;

public class User implements Runnable {
    FileObject fObj;
    private String name;

    public User(FileObject fObj,String name){
        this.fObj=fObj;
        this.name=name;
    }

    @Override
    public void run() {
        while(true){
            try{
                List<Object> objects = fObj.getObjects();
                for(Object o : objects)
                {
                    System.out.print(o+ "이용");
                }
                System.out.println();
            }
            catch (Exception e){
                e.printStackTrace();
                break;
            }
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
        }
    }
}
