package ThreadStop;

public class AppStart {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0;i<100;i++)
                {
                    System.out.println(i+"번 반복중");
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        System.out.println("인터럽트 예외 발생");
                        break;
                    }
                }
                System.out.println(Thread.currentThread().getName()+"스레드를 종료");
            }
        };
        t1.start();
        try{
            Thread.sleep(4000);
            t1.interrupt();
        }
        catch (InterruptedException e){}
    }
}
