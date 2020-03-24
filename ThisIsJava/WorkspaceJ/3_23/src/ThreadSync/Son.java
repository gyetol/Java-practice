/*
package ThreadSync;

public class Son extends Thread {
    private Bank bank;

    public Son(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        */
/*int i=0;
        while(!bank.getIsReady()){
           i++;
           try{
               Thread.sleep(50);
           }catch(InterruptedException e){}
        }
        System.out.println(i);*//*


       */
/* int money=1000;
            synchronized (bank) {
                try {
                    bank.wait();
                } catch (InterruptedException e) {
                }
                bank.notify();
            }

         money=bank.withdraw(1000);
        System.out.println("아들 : "+ money+ "출금");*//*

       for(int i=0;i<10;i++) {
           synchronized (bank) {
               try {
                   bank.wait();
               } catch (InterruptedException e) {
               }
               int money = 1000;
               money = bank.withdraw(money);
               System.out.println(money + "원을 출금하였습니다.");
               synchronized (bank) {
                   bank.notify();
               }
           }
       }
    }
}
*/
