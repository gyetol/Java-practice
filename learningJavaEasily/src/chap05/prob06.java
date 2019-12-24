package chap05;

public class prob06 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arr=reverse(arr);
        for(int num:arr)
        {
            System.out.print(num);
            System.out.print(" ");
        }
    }
    public static int[] reverse(int[] org)
    {
        int array[]=org;
        for(int i=0;i<org.length;i++)
        {
            array[i]=org[org.length-1-i];
        }
        return array;
    }
}
