package chap05;
import java.util.Scanner;
public class prob01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String s=in.next();
        System.out.print("문자를 입력하세요:");
        char c=in.next().charAt(0);
        System.out.println(countChar(s,c));
    }
    static int countChar(String s,char c){
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c){cnt++;}
        }
        return cnt;
    }
}

