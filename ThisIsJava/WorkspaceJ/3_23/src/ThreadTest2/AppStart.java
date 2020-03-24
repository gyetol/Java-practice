package ThreadTest2;

import org.w3c.dom.ls.LSOutput;

class MyThread extends Thread{
   // private int a;
    protected int a;

    public MyThread(int a){
        this.a=a;
    }

    public void setA(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }
}

class Bank{
    int balance;
}

abstract class MyBank extends Bank implements Runnable{ }

public class AppStart {
    public static void main(String[] args) {

        Thread t= new Thread(new MyBank() {
            @Override
            public void run() {

            }
        });




        int number=1000;
        number=200;
        Thread t0=new MyThread(number){
            //number=100; (안에서 쓰는 순간 final이라서 못 바꾼다)
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                   // super.setA((super.getA())++);
                    a++;
                    try{
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e){}
                }
                System.out.println("a 멤버의 값 : "+a);
            }
        };
        Thread t1= new Thread(){
          public void run(){ //익명클래스를 이용하면 메인메소드 안의 변수를 참조할수 있다( 단, final로 봐진다)


              for(int i=0; i<10;i++)
              {
                  System.out.println(Thread.currentThread().getName()+" : "+i);
                  try{
                      Thread.sleep(500);
                  }
                  catch (InterruptedException e){}
              }
          }
        };
        t1.setName("첫 번째 스레드");

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<10;i++)
                {
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    try{
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e){}
                }
            }
        },"두 번째 스레드");

        t0.start();
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName()+"종료");
    }
}
