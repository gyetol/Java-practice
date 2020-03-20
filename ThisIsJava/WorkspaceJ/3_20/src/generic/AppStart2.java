package generic;

class Map<K,V>{
    private K key;
    private V value;

    public Map(K key,V value){
        this.key=key;
        this.value=value;
    }

    public void setKey(K key){
        this.key=key;
    }
    public void setValue(V value){
        this.value=value;
    }
    public K getKey(){
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AppStart2 {
    public static void main(String[] args) {
        Map<String,String> map1 =new Map<>("1번타자","홍길동"); // new 뒤의 <String,String>은 생략 불가
        Map<Number,String> map2= new Map<>(12.12,"헤헤"); //Number를 상속하는 하위클래스형은 다 가능 ~ Double,Integer 등

       System.out.println(map1.getKey()+":"+map1.getValue());
        System.out.println(map2.getKey()+":"+map2.getValue()); //Number타입으로 출력을 했지만, 오버라이딩 되어있어서 DOUBLE타입으로 출력함

        Map map3 =new Map("1번타자",new Person("이승엽")); //타입을 안주면 Object형으로 들어가고 나온다. 클래스는 제네릭클래스지만 사용을 안한격
        System.out.println(map3.getKey()+":"+(Person)map3.getValue());

        Map<Integer,Person> map4 = new Map<Integer, Person>(11,new Person("이승엽"));
        System.out.println(map4.getKey()+":"+(Person)map4.getValue());
    }
}
