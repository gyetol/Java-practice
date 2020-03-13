package p6;

import p5.Iterator;
import p6.DoubleIterator;

public class DoubleCollection {
    private double[] base;
    private int count;

    public DoubleCollection(int size) {
        base = new double[size];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void add(double value) {
        if (count < base.length) {
            base[count++] = value;
        }
    }

    public double getAt(int idx) {
        if (idx < count) {
            return base[idx];
        }
        return -1;
    }

    public Iterator iterator(){
        return new DoubleIterator(this);
    }
}

