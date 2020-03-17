package p4_practice;

public class Iterator {
    private Collection collection;
    private int cursor;

    public Iterator(Collection collection){
        this.collection=collection;
        cursor=0;
    }

    public boolean hasNext(){
        if(cursor<collection.getCount()){
            return true;
        }
        return false;
    }

    public int next(){
        return collection.getAt(cursor++);
    }
}
