package Service_Using_Thread_Collection;

public abstract class Service implements Runnable {
    protected Customer customer;

    public void requestUser(Customer customer){

    }

    public abstract String getServiceName();
}
