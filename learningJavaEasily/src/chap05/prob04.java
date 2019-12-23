package chap05;
import java.util.Scanner;
public class prob04 {
    public static void main(String[] args) {
        String url;
        Scanner in=new Scanner(System.in);
        while(true) {
            System.out.print("URL을 입력하세요 :");
            url = in.next();
            if(url.equalsIgnoreCase("bye")){break;}
            if(url.endsWith("com")){System.out.println("'com'으로 끝납니다.");}
            if(url.contains("java")){System.out.println("'java'를 포함합니다.");}
        }
    }
}
