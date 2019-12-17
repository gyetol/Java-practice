package chap04;
class Ch{static int sumOneToTen=10;}
public class Ex4_12 {
    static int sumOneToTen;

    static {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            sumOneToTen = sum+2;
        }
    }
        public static void main(String[] args){
            //Ch ch1=new Ch();
            System.out.println(sumOneToTen);
        }

    }
