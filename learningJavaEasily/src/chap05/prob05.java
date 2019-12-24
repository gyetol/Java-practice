package chap05;
import java.util.Scanner;
public class prob05 {
    public static void main(String[] args) {
        int num[]=new int[10];
        int number,tenDigit;
        Scanner in= new Scanner(System.in);
        System.out.println("숫자를 10개 입력하세요.");
        for(int i=0;i<10;i++)
        {
            number=in.nextInt();
            if(number<0){continue;}
            tenDigit=number/10;
            num[tenDigit]++;
        }
        for(int i=0; i<100;i+=10)
        {
            System.out.printf("%2d ~ %2d : ",i,i+9);
            for(int j=0;j<num[i/10];j++){System.out.print("*");}
            System.out.println();
        }
    }
}
