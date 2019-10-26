package p1;

public class Student {
    private String name;
    private int jumsu;
    private int rank;

    public Student(String name,int jumsu){
        this.name=name;
        this.jumsu=jumsu;
        this.rank=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJumsu(int jumsu) {
        this.jumsu = jumsu;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getJumsu() {
        return jumsu;
    }

    public int getRank() {
        return rank;
    }

    public String toString(){
        return(name+ ","+jumsu+","+rank);
    }

}
