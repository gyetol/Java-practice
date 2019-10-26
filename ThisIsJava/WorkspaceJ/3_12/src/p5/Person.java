package p5;

public class Person {
    protected String name;
    public Person(String name){
        this.name=name;
        System.out.println("Person클래스의 생성자 호출");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return ("이름: "+ name);
    }

    public void show(){

    }

    public static final void showInfo(){ //자식이 개방을 못해준다 final이 붙었으므로

    }

}
