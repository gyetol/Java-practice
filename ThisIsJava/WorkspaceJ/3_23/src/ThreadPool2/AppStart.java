package ThreadPool2;

import java.util.concurrent.*;

public class AppStart {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++)
        {
          Future<Integer> future=  executorService.submit(new Callable<Integer>(){
               public Integer call(){
                   int sum=0;
                   for(int i=0;i<10;i++){
                       sum+=i;
                   }
                   return sum;
               }
            });
            try{
                int result=future.get(); //결과값을 가져올때까지 기다려준다. block이 걸린다는 것이다.
                System.out.println(result);
            }catch (InterruptedException  | ExecutionException e ){}
        }
    }
}
