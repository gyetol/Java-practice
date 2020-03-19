package Message;

import java.text.DecimalFormat;

public class AppStart {
    public static void main(String[] args) {
        int money=1000000;
        double pi=3.14195;
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println(df.format(money));
        DecimalFormat df2 = new DecimalFormat("0.###");
        System.out.println(df2.format(pi));
    }
}
