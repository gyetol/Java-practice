package InnerClass;

public class Car {
    public final static String TYPE = "자동차";
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        Engine e = new Engine(3000);
        e.on();
    }

    interface Runnable {
        public abstract void run();
    }

    class Engine {
        public static final String ENGINE_TYPE = "롤스로이스 마린"; //Engine클래스를 static으로 하면 외부에서 Car.Engine.ENGINE_TYPE 참조가능
        private int displacement;

        public Engine(int displacement) {
            this.displacement = displacement;
        }

        public void setDisplacement(int displacement) {
            this.displacement = displacement;
        }

        public int getDisplacement() {
            return displacement;
        }

        public void on() {
            System.out.println("타입:" + Car.TYPE);
            System.out.println(Car.this.name + "의 시동을 겁니다."); //outer클래스의 멤버를 참조할 경우: 클래스명.this.
            System.out.println("엔진타입: " + Engine.ENGINE_TYPE);
            System.out.println("배기량:" + this.displacement);
        }
    }
}
