package ThreadSync2;

public class User implements Runnable {
    private String name;
    private Bank bank;

    public User(String name,Bank Bank){
        this.name=name;
        this.bank=bank;
    }

    public void setBank(Bank bank){
        this.bank=bank;
    }

    public Bank getBank() {
        return bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int money = 1000;
            synchronized (bank) { //블록 동기화 => 동기화시킬 객체를 명시해줘야 한다.
                money = bank.withdraw(money);
                System.out.println(i + " : " + name + "님이 " + money + "원을 인출하였습니다.");
                System.out.println("통장잔액: " + bank.getBalance() + "원");
            }
        }
    }
}
