package String;

import org.w3c.dom.ls.LSOutput;

public class AppStart {
    public static void main(String[] args) {
        String str="1234";

        int num=0;
        for(int i=0;i<str.length();i++){
            num=(str.charAt(i)-'0');
            num*=10;
        }
        System.out.println(num);
    }

}

/*class Exponent{
    private static int num=1;

    public static Exponent(int exp){
        for(int i=0;i<exp;i++)
        {
            num*=10;
        }
        num=num;
    }
}*/
