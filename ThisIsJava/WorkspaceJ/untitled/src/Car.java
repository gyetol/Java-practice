public class Car {
    private static int count = 0;
    private String name;
    public int mCount;

    public static void increment() {
        count++;
    }

    public Car() {
        this("소나타");
        mCount++;
    }

    public Car(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return ("차종: " + name);
    }
}
