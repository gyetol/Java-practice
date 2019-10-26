import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("지급액:");
        int coin=sc.nextInt();
        int coinNum=0;
        int[] coinValue={500,100,50,10,5,1};
        int[] coinValueCnt=new int[coinValue.length];

        for(int i=0;i<=coinValue.length;i++)
        {
            coinValueCnt[i]=coin/coinValue[i];
            coin=coin-(coinValue[i]*coinValueCnt[i]);
            coinNum+=coinValueCnt[i];
        }

        System.out.println("동전의 개수 :"+coinNum);

    }
}
