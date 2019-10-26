import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력:");
        int num = sc.nextInt();
        int cnt = 0;

        /*for(int i = 1;i<=Integer.MAX_VALUE; i *= 10)
        {
           cnt++;
            System.out.println("*\n");
        }*/


        for (int i = 1; i <= num; i *= 10) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
