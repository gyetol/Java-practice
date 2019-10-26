import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("학생수:");
       int num=sc.nextInt();
       int res;
       res=num/3;
       System.out.println("학생수가 "+num+"명일 때 필요한 선풍기의 대수는 "+(res+1));
    }
}