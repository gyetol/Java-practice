package chap05;
//미완성
public class prob02 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
        int arr[]={2,3};
        System.out.println(sum(1,arr));
        System.out.println(sum(1,2,3,4,5));
    }
   /* private static int sum(int i, int j, int k) {
        return k+j;
    }

    private static int sum(int i, int... arr) {
        int sum=0;
        for(int a : arr)
            sum += a;
        return sum;
    }*/
    /*public static int sum(int...num){
        int sum=-1;
        for(int n:num)
        {
            sum+=n;
        }
        return sum;
    }*/
}

