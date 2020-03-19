package Math_Random;

import java.util.Arrays;

public class AppStart {
    public static void main(String[] args) {
        int cnt=0;
        int[] arr=new int[1000];
        int tmp;
        boolean tf=false;
        while(cnt<1000)
        {
            tf=false;
           tmp =(int)(Math.random()*1000);
           for(int i=0;i<cnt;i++)
           {
               if(tmp==arr[i]){
                   tf=true;
                   break;
               }
           }
           if(!tf){
               arr[cnt]=tmp;
               cnt++;
           }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
