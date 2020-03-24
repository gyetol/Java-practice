package ThreadTest;

class Counter extends Thread implements Runnable{
    private int count;

    public Counter(){
        this.count=0;
    }

    public int getCount(){
        return this.count;
    }
    public void run(){
        for(int i=0;i<10;i++)
        {
            count++;
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){}
            System.out.println("counter의 값 : "+count);
        }

    }
}

public class AppStart {
    public static void main(String[] args) {
       // Counter counter= new Counter();
       // counter.run(); //단순히 메소드 호출... run이 끝나고 아래 문구를 출력
       // counter.start(); //쓰레드 클래스의 start를 실행함으로써 새로운 작업공간이 만들어서 메인쓰레드와 다른 흐름으로 작동(작업 끝나는 것 안 기다리고 바로 다음으로 넘어감)
       Thread t1= new Thread(new Counter());
       t1.setDaemon(true); //start하기 전에 true or false를 정해줘야한다. false이면 메인쓰레드가 끝났는지 여부에 관계없이 자신쓰레드 완료함
       t1.start();
       try{
           Thread.sleep(2000);
       }
       catch (InterruptedException e){}

        System.out.println("프로세스를 종료합니다.");
    }
}
