package p2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Box{
    int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(int n){
        this.number=n;
    }
    public int getNumber(){
        return number;
    }
}

class MyBoxControl implements Runnable{
    Box box;

    public MyBoxControl(Box box){
        this.box=box;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            box.setNumber(box.getNumber()+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
        }
    }
}

public class AppStart {
    public static void main(String[] args) {
        Box box=new Box();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for (int i=0 ; i<10;i++)
        {
         Future<Box> future=   executorService.submit(new MyBoxControl(box),box);
         try{
             Box b=future.get();
             System.out.println(b.getNumber());
         }catch (InterruptedException | ExecutionException e){}
        }
        executorService.shutdown();
        System.out.println(box.getNumber());
    }
}
