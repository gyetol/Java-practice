import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n값:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i+=2)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
