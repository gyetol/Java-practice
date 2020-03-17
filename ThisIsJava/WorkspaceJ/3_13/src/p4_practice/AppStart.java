package p4_practice;

public class AppStart {
    public static void main(String[] args) {
        Collection cl= new Collection(100);
        cl.add(30);
        cl.add(20);
        cl.add(10);

        Iterator it=cl.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
