package chap05;

public class prob06 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[];
        arr1=reverse(arr);
        for(int num:arr1)
        {
            System.out.print(num);
            System.out.print(" ");
        }
    }
    public static int[] reverse(int[] org)
    {
       // int array[]=org;    <- org배열크기만큼 array배열크기를 할당하려고 했으나, 이 실행문은 변수명은 다르나 같은 객체를 공유하게 된다...
        int array[]=new int[5];
        for(int i=0;i<org.length;i++)
        {
            array[i]=org[org.length-1-i];
        }
        return array;
    }
}


