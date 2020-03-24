package ThreadPractice2;

public class Student implements Runnable {
    private String name;
    private Bakery bakery;
    private Thread next;

    public Student(String name, Bakery bakery,Thread next){
        this.name=name;
        this.bakery=bakery;
        this.next=next;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void run() {
        try{
            this.next.join();
        }catch (InterruptedException e){}


        String bread=null;
        synchronized (bakery) {
            try{
                bakery.wait();
            }catch(InterruptedException e){}

            bread = bakery.getBread();
        }
        if(bread!=null){
            System.out.println(name+"님이 "+bread+"를 꺼냈습니다.");
        }
        else{
            System.out.println(name+"님의 외침: 나에게 죽음 아니면 빵을 달라!");
        }
        synchronized (bakery){
            bakery.notify();
        }
    }
}
