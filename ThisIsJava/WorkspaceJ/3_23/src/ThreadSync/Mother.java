/*
package ThreadSync;

public class Mother extends Thread {
    private Bank bank;

    public Mother(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        */
/*try{
            Thread.sleep(500);
        }catch (InterruptedException e){}*//*


        //bank.deposit(1000);
       // bank.setReady(true);
        for(int i=0;i<10;i++) {
            synchronized (bank) {
                bank.deposit(1000);
                System.out.println("엄마 : 1000원 입금");
                try {
                    bank.notify();
                    bank.wait();
                } catch (InterruptedException e) {
                }


            }
        }
    }
}
*/
