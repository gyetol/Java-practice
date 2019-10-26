//배열이 하나 주어질때 -1을 만날대까지 출력하는 프로그램
public class Ex8 {
    static void func(int[] arr,int n,int m){
        if(n>=arr.length){
            System.out.println("검색 실패!");
            return;
        }
        else if(arr[n]==m){
            return;
        }
        else{
            System.out.println(arr[n]+ " ");
            func(arr,n+1,m);
        }
    }
    public static void main(String[] args) {
        int[] ar={5,2,6,7,-1,3,-9,10,4};
        func(ar,0,-9);
    }
}
