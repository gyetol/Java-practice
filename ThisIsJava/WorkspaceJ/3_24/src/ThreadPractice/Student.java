package ThreadPractice;

public class Student implements Runnable {
    private String name;
    private Bakery bakery;

    public Student(String name,Bakery bakery){
        this.name=name;
        this.bakery=bakery;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public void run() {
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
