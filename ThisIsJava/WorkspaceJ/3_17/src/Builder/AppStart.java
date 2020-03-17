package Builder;

public class AppStart {
    public static void main(String[] args) {

        Car c1=CarBuilder.getBuilder().setName("벤츠").setColor("은색").setDisp(4500).getInstance();
        Car c2=CarBuilder.getBuilder().setName("카마로").setColor("노랑").setDisp(6000).getInstance();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
