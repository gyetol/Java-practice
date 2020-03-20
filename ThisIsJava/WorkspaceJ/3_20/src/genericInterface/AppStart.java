package genericInterface;

interface Run<T>{ //제네릭 인터페이스

}

class Circle1<T>{//제네릭 클래스

}

class Circle<T>{
    T r;

    public void setR(T r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return r+"";
    }
}

class Maker{
    public <T> Circle<T> func(T a){
        Circle<T> circle = new Circle();
        circle.setR(a);
        return circle;
    }
}



public class AppStart {
    public static void main(String[] args) {
        Box box = new Box(10);
        int result = box.compareTo(20);
        System.out.println(result);

        Circle c =new Circle();
        //c.<Integer>func(100);
    }
}
