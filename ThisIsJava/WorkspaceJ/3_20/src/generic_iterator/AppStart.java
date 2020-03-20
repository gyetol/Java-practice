package generic_iterator;

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public String toString(){
        return this.name;
    }
}

public class AppStart {
    public static void main(String[] args) {
        MyCollection<Person> pc = new MyCollection<>(50);
        pc.add(new Person("홍길동"));
        pc.add(new Person("심청이"));
        pc.add(new Person("이순신"));

        Iterator<Person> pit=pc.iterator();

        while(pit.hasNext()){
            Person p = pit.next();
            System.out.println(p);
        }






        MyCollection<Integer> c=new MyCollection<>(100);
        c.add(100);
        c.add(200);
        c.add(300);

        Iterator<Integer> it =c.iterator();

        while(it.hasNext()){
            int value= it.next();
            System.out.println(value);
        }
    }
}
