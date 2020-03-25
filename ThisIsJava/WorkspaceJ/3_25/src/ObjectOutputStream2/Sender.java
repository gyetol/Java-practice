package ObjectOutputStream2;

import java.util.Random;

public class Sender implements Runnable {
    private FileObject fObj;
    private String name;

    public Sender(FileObject fObj,String name){
        this.fObj=fObj;
        this.name=name;
    }

    @Override
    public void run() {
        Random rand= new Random();
        while(true){
            int r= rand.nextInt();
            try {
                fObj.saveObject(r);
                System.out.println(name+"님이 파일에 기록하였습니다");
            }
            catch (Exception e){
                e.printStackTrace();
                break;
            }
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){}
        }
    }
}
