/*
package p7_solution;

public class DoubleIterator extends Iterator{
    private DoubleCollection collection;
    private Node cursor;

    public  DoubleIterator(DoubleCollection collection){
        this.collection=collection;
        this.cursor=collection.getHead();
    }

    public boolean hasNext() {
        if (cursor != null) {
            return true;
        }
        return false;
    }
    public Object next(){
        double tmp=cursor.getData();
        cursor=cursor.getNext();
        return tmp;
    }
}
*/
