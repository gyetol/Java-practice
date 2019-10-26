public class Ex2 {
    public static void main(String[] args) {
        int i,j=1;
      gugu:  for(i=2;i<=9;i++)
        {
            for(j=2;j<=9;j++)
            {
                if((i==5)&&(j==5))
                {
                    break gugu;
                }
            }
        }
        System.out.println(i+"x"+j+"="+(i*j));
    }
}
