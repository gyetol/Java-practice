package Arrays;

import java.util.Arrays;
public class AppStart {
    public static void main(String[] args) {
        int[] arrs={3,5,76,4,432,5,7,833,65,24,6,5,7};
        for(int a:arrs)
        {
            System.out.printf("%5d",a);
        }
        Arrays.sort(arrs);
        System.out.println();
        for(int a:arrs)
        {
            System.out.printf("%5d",a);
        }

    }
}
