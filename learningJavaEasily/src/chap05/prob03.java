package chap05;

public class prob03 {
    public static void main(String[] args) {
        double[][] interests={{3.2,3.1,3.2,3.0},{2.9,2.8,2.7,2.6},{2.7,2.6,2.5,2.7}};
        double[] sum1={0.0,0.0,0.0};
        double sum2=0.0;

        for(double sum:sum1)
        {
            for(double[] rate:interests)
            {
                sum+=rate
            }
        }
    }
}
