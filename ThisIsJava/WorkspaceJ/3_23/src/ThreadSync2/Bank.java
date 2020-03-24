package ThreadSync2;

public class Bank {
    private String account;
    private int balance;
   // private volatile boolean isReady; // volatile: 컴파일러가 최적화를 못하게끔 막음

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
       // this.isReady=false;
    }

 /*   public void setReady(boolean ready) {
        isReady = ready;
    }*/

    public String getAccount(){
        return account;
    }

    public int getBalance() {
        return balance;
    }
   /* public boolean getIsReady(){
        return isReady;
    }*/

    public void deposit(int amount){
        balance+=amount;
    }
    public synchronized int withdraw(int amount){ //메소드 동기화
        if(amount>balance){
            return 0;
        }
        balance-=amount;
        return balance;
    }
}
