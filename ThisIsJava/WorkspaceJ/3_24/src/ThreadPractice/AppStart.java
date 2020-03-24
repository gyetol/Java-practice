package ThreadPractice;

public class AppStart {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        bakery.add("고구마빵");
        bakery.add("소보로빵");
        bakery.add("레몬빵");

        Thread[] students =new Thread[]{
                new Thread(new Student("홍길동",bakery)),
                new Thread(new Student("심청이",bakery)),
                new Thread(new Student("에디슨",bakery)),
                new Thread(new Student("변사또",bakery)),
        };

        for(Thread t : students){
            t.start();
        }


        while(true){
            boolean isReadyAll =true;
            try{Thread.sleep(5);}catch (InterruptedException e){}
            for(Thread t : students){
                if(t.getState()!=Thread.State.WAITING){
                    isReadyAll=false;
                    break;
                }
            }
            if(isReadyAll){
                break;
            }
        }

        synchronized (bakery){
            bakery.notify();
        }
    }
}
