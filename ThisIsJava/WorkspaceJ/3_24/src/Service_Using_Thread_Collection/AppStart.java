package Service_Using_Thread_Collection;

public class AppStart {
    public static void main(String[] args) {
        ServicePool servicePool = new ServicePool();
        Customer c1=new Customer("a");
        Customer c2=new Customer("b");
        Customer c3=new Customer("c");

        Service s= servicePool.serviceRequest("주문");
        s.requestUser(c1);
        s.start();
    }
}
