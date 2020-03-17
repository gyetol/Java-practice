package p4_practice;

public class Collection {
    private int[] base;
    private int count;

    public Collection(int size){
        base=new int[size];
        count=0;
    }

    public void setBase(int[] base)
    {
        this.base=base;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getBase() {
        return base;
    }
    public int getCount(){
        return count;
    }
    public void add(int value){
        if(count<base.length){
            base[count]=value;
            count++;
        }
        else{
            System.out.println("꽉 차서 넣을수가 없습니다.");
        }
    }
    public int getAt(int idx){
        if(idx<count){
            return base[idx];
        }
        return -1;

    }

    public Iterator iterator(){
        return new Iterator(this);
    }

}
