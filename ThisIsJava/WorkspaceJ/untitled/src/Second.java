public class Second {
    public static void main(String[] args) {
        Integer[] a = {1,2,4};
        for(int i=0;i<a.length;i++){
            a[i]=a[i]+10;
        }

        for (Integer v : a)
        {
            v+=10;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
