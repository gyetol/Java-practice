package generic;

interface  Flyable<T>{ }

class Person1<T>{ }

class Duck1<T> implements Flyable<T>{ }
class Duck2 implements Flyable<Integer>{ }

class Student extends Person1<Double>{ }

interface Fightable{}
class Fighter<T> implements Fightable{}

class Duck{}
class MalleredDuck<T> extends Duck{}

class Person<T>{
    private T value;

    public Person(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class AppStart {
    public static void main(String[] args) {
          Person<Integer> p = new Person<>(10);
          //Person<Double> p1 = new Person<>(10); //불가
        Person<Number> p3 = new Person<>(10.4);
    }
}
