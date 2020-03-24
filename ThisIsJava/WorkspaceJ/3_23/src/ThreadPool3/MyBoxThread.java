package ThreadPool3;

public class MyBoxThread implements Runnable {
    private Box box;

    public MyBoxThread(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            sum+=i;
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){}
        }
        box.add(sum);
    }
}
