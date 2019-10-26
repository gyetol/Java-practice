

public class Ex1 {
    public static void main(String[] args) {
        int m=1700;
        int[] n = {500,100};
        int coinNum=0;
        coinNum=m/n[0];
        coinNum=coinNum+ ((m-n[0]*coinNum)/n[1]);
        System.out.println(coinNum);
    }
}
