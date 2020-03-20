package p1;

class Person<K,V>{
    private K name;
    private V jumsu;

    public Person(K name,V jumsu){
        this.name=name;
        this.jumsu=jumsu;
    }

    public void setName(K name) {
        this.name = name;
    }

    public void setJumsu(V jumsu) {
        this.jumsu = jumsu;
    }
    public K getName(){
        return this.name;
    }
    public V getJumsu(){
        return this.jumsu;
    }
}

public class AppStart {

    public static <K,V> Person<K,V> func(K name,V jumsu){
        Person<K,V> person = new Person<K,V>(name,jumsu);

        return person;
    }

    public static void main(String[] args){
        Person<String,Integer> person = AppStart.<String,Integer>func("홍길동",100);
        System.out.println(person.getName()+":"+person.getJumsu());
    }
}
