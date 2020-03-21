package generic2;

public final class Worker extends Person{
    public static final String TYPE="직장인";
    private String job;

    public Worker(String name,String job){
        super(name);
        this.job=job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString()+":"+getJob();
    }
}
