package ThreadJoin;

public class AppStart {
    public static void main(String[] args) {
        Thread t =new Thread(){
            @Override
            public void run(){
                for(int i=0;i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){e.printStackTrace();}
                }}

        };
        t.start();
        try{
            t.join();// 일이 끝날때까지 기다린단
        }
        catch (InterruptedException e){e.printStackTrace();}
        System.out.println(Thread.currentThread().getName()+"종료");
    }
}
