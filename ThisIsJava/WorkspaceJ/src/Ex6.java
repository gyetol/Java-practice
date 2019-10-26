public class Ex6 {
    public static void main(String[] args) {
       // int[][]a={{1,2,3},{4,5},{6,7,8,9,10}}; //초기화리스트 이용한 초기화
       // int [][]a=new int[10][10];
        /*int[] a=null;
        a= new int[]{1,2,3,4,5}; */
        int[][] a;
        a=new int[3][];
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[5];
        a[1][1]=10;

        System.out.println(a.length);
        System.out.println(a[2].length);

        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int [] tmp:a){
            for(int value:tmp){
                System.out.println(value);
            }
        }

    }
}
