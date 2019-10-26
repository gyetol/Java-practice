public class Ex4 {
    public static void main(String[] args) {
        for(int i=2020;i<=3020;i+=4)
        {
            if(i%4==0){System.out.println(i);}
            else if(i%100==0){;}
            else if(i%400==0){System.out.println(i);}
            else{;}
        }
    }
}
