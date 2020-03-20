package Math_Random;

import java.util.Random;

//일단 채우고 바꿔돌리는게 빠르다

public class AppStart2 {
    public static void main(String[] args) {
        final int count = 1000;
        int[] ary = new int[1000];
        Random rand= new Random();

        for (int i = 1; i < 1000; i++) {
            ary[i] = i;
        }
        for (int i = 0; i < ary.length; i++) {
            int r = rand.nextInt(1000);
            int tmp = ary[0];
            ary[0] = ary[r];
            ary[r] = tmp;
        }
        for (int i = 0; i < ary.length; i++) {

            if ((i % 10) == 0&&(i != 0)){
                System.out.println();
            }
            System.out.printf("%5d", ary[i]);
        }


    }
}

