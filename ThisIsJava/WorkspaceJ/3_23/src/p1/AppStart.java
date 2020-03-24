package p1;

class Bank{
    int balance;

    public Bank(){
        this(0);
    }
    public Bank(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }

    public int getBalance() {
        return balance;
    }
}

class Sender implements Runnable{
    private Bank bank;

    public Sender(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            bank.deposit(1000);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
    }
}


class Receiver implements Runnable{
    private Bank bank;
    public Receiver(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        System.out.println("통장잔고 : "+bank.getBalance()+"원");
    }
}
public class AppStart {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread sender=new Thread(new Sender(bank));
        Thread receiver= new Thread(new Receiver(bank));

        sender.start();
        while(sender.getState()!=Thread.State.TERMINATED); // 코드해석은 편하지만 while문이 무지하게 돈다 -> 따라서 조인이 낫다
        receiver.start();

        sender.start();
        try{
            sender.join();
            receiver.start();
        }catch (InterruptedException e){} //위랑 같은 코드이다.
    }
}
