import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n승:");
        int exp=sc.nextInt();
        int res=1;
        for(int i=1;i<=exp;i++)
        {
            res*=2;
        }
        System.out.println(res);
    }
}
