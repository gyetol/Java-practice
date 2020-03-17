package p5_practice;

public class IntegerCollection extends Collection {
    private int[] base;
    private int count;

    public IntegerCollection(int size){
        this.base= new int[size];
        this.count=0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setBase(int[] base) {
        this.base = base;
    }

    public int getCount() {
        return count;
    }

    public int[] getBase() {
        return base;
    }

    public void add(int value){
        if(count<base.length){
            base[count]=value;
            count++;
        }
    }
    public int getAt(int idx){
        if(idx<count){
            return base[idx];
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new IntegerIterator(this) ;
    }
}
