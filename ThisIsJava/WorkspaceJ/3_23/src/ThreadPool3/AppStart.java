package ThreadPool3;

import java.util.concurrent.*;

public class AppStart {
    public static void main(String[] args) {
        Box box =new Box();
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        CompletionService<Box> completionService = new ExecutorCompletionService<Box>(executorService);

        for(int i=0;i<10;i++)
        {
            completionService.submit(new MyBoxThread(box),box);
        }
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Future<Box> future = completionService.take();
                        Box b=future.get();
                        System.out.println(b.getNumber());
                    }catch(InterruptedException | ExecutionException e){
                        break;
                    }
                }
            }
        });
        t.start();
        System.out.println("메인 프로세스 종료");
    }
}
