package genericInterface;
/*public class Box<T> implements Comparable<T> {
   T size;

    public Box(T size){
        this.size=size;
    }

    @Override
    public int compareTo(T a) {
        return (this.size-((T)a)size);
    }
}*/

public class Box implements Comparable<Integer>{
    private int size;

    public Box(int size){
        this.size=size;
    }

    @Override
    public int compareTo(Integer a) {
        return (this.size-a);
    }
}