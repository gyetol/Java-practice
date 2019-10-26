public class Start {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();

        System.out.println(c1.mCount);
        System.out.println(c2.mCount);
        System.out.println(c3.mCount);
        System.out.println(Car.getCount());
    }
}
