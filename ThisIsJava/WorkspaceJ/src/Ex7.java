public class Ex7 {
    //static int count;
    static void func(int n,int m){
        if(n>m){return;}
        else{System.out.print(n+" ");
            func(n+1,m);
        }
    }
    public static void main(String[] args) {
       func(1,20);
    }
}
