import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n값:");
        int n=sc.nextInt();
        int sum=0;
        int i=2;
        while(i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}

