public class Ex4 {
    public static void main(String[] args) {
        int[] a={1,5,2,3,7,4,6}; //member initialization list 멤버 초기화 목록
        int[] ar= new int[10]; // int형 10개짜리를 힙에 할당하라는 뜻이다
        int[] arr=new int[]{10,20,30,40};
        //int[] b=new int[];
        System.out.println(a.length);
        for(int i=0;i<8;i++)
        {
            System.out.println(a[i]);
        }

    }
}
