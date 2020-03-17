package p5_practice;

public class IntegerIterator extends Iterator {
    private IntegerCollection collection;
    private int cursor;

    public IntegerIterator(IntegerCollection collection){
        this.collection=collection;
        this.cursor=0;
    }

    @Override
    public boolean hasNext() {
        if(cursor<collection.getCount()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
       return collection.getAt(cursor++);
    }
}
