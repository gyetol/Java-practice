package p5_practice;

public class AppStart {
    public static void main(String[] args) {
        IntegerCollection ic = new IntegerCollection(100);
        ic.add(234);
        ic.add(444);
        ic.add(5453);
        ic.add(23423);
        Iterator it = ic.iterator();
        while(it.hasNext()){
            int value = (int) it.next();
            System.out.println(value);
    }
}


}
