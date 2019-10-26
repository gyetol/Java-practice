import java.lang.*; // 이렇게 하지 않아도 항상 자동으로 임포트되어 있다
import p3.Integer;
import p3.City;
import p3.Subject;

public class AppStart {
    public static void main(String[] args) {
        Integer a = new Integer();
        City c =City.SEOUL;
        int num=Subject.KOR;

        System.out.println(c.getKm());
        System.out.println(c.compareTo(City.BUSAN));
        System.out.println(num);
    }
}
