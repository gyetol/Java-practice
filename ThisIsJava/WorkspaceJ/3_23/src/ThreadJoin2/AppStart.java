package ThreadJoin2;

class Computer extends Thread{
    private int result;

    public int getResult(){
        return this.result;
    }

    @Override
    public void run() {
        for(int i=1;i<10;i++)
        {
            result+=i;

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){}
        }
        System.out.println("계산 완료");
    }
}

public class AppStart {
    public static void main(String[] args) {
        Thread t =new Computer();
        t.start();
        try{
            //Thread.sleep(2000);
            t.join(); //메인메소드는 t한테 자기 껴달라고 한다. 그러면 t는 자기 끝나고 불러준다
        }catch (InterruptedException e){}
        System.out.println("결과 : "+((Computer)t).getResult());
    }
}
