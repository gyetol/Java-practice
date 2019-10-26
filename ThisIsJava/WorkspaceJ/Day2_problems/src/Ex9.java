import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n:");
        int num=sc.nextInt();
        System.out.print("m승:");
        int exp=sc.nextInt();
        int res=1;
        for(int i=1;i<=exp;i++)
        {
            res*=num;
        }
        System.out.println(res);
    }
}
