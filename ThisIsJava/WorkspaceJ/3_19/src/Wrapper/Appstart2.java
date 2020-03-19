package Wrapper;

public class Appstart2 {
    public static void main(String[] args) {
        Integer[] ar={10,20,30};
        /*for(int i=0;i<ar.length;i++){
            ar[i]=ar[i]+1;
        }*/

        for(Integer i :ar){
            i=i+1;
        }
        for(int value:ar){
            System.out.println(value);
        }
    }

}
