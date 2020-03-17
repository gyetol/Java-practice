package CloneTest;

public class AppStart {
    public static void main(String[] args) {
        SportCar c =new SportCar("벤츠","검정",250);
        try {
            SportCar tmp=(SportCar)c;
            SportCar nc= (SportCar)tmp.clone();
            nc.setMaxSpeed(300);
            System.out.println(c.toString());
            System.out.println(nc.toString());
            /*Car newCar =(Car)c.clone();
            c.setName("그랜져");
            c.setColor("흰색");
            System.out.println(c.getName()+c.getColor());
            System.out.println(newCar.getName()+newCar.getColor());*/
        }
        catch (CloneNotSupportedException e){
            System.out.println("복제가 지원되지 않는 객체입니다.");
            e.printStackTrace();
        }
    }




}
