package ThreadGroup;

public class AppStart {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("내 작업그룹");
        for(int i=0;i<10;i++)
        {
            Thread t1= new Thread(tg,new Runnable(){
                public void run(){
                    for(int i=0;i<100;i++){
                        System.out.println(Thread.currentThread().getName());
                        try{
                            Thread.sleep(200);
                        }
                        catch (InterruptedException e){
                            break;
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"작업 종료!!!");
            }
        },i+"번 작업");
            t1.start();
        }
    }
}
