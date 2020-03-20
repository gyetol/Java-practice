package generic_iterator;

public class MyCollection<T> implements Collection<T> {

    private T[] base;
    private int count;

    public MyCollection(int capacity){
        //this.base= new T[capacity]; //이렇게 불가
        this.base=(T[])(new Object[capacity]); //Object를 참조하는 변수나, Integer를 참조하는 변수나 크기가 같으므로 Object타입으로 배열생성
        count=0;
    }

    public int getCount(){
        return this.count;
    }

    public void add(T value){
        base[count++]=value;
    }
    public T getAt(int index){
        return base[index];
    }

    public Iterator<T> iterator(){
        return new MyIterator<T>(this);
    }
}
