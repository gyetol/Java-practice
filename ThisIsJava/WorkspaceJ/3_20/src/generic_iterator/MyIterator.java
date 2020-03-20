package generic_iterator;

public class MyIterator<T> implements Iterator<T> {

    private MyCollection<T> collection;
    private int cursor;

    public MyIterator(MyCollection<T> collection){
        this.collection=collection;
        cursor=0;
    }

    @Override
    public boolean hasNext() {
        return (cursor<collection.getCount());
    }

    @Override
    public T next() {
        return collection.getAt(cursor++);
    }
}
