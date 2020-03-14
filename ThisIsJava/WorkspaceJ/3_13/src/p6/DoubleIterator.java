/*
package p6;

import p5.Iterator;

public class DoubleIterator extends Iterator {
    DoubleCollection collection;
    private Node cursor;

    public DoubleIterator(DoubleCollection collection){
        this.collection=collection;
        cursor =null;
    }

    public boolean hasNext(){
        if(cursor.getNext()!=null){
            return true;
        }
        return false;
    }

    public Object next(){
       /return cursor.setNext(cursor.getNext());
        return collection.getAt(cursor++);
    }
}
*/
