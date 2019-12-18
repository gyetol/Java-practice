package chap04;
//challenge01~03

class Printer{
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers,boolean duplex)
    {
        this.numOfPapers=numOfPapers;
        this.duplex=duplex;
    }

    void print(int amount)
    {
        if(duplex==false) {
            if (numOfPapers == 0) {
                System.out.println("용지가 없습니다.");
            } else if (numOfPapers < amount) {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "장 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0;
            } else {
                numOfPapers -= amount;
                System.out.println("단면으로"+amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        }
        else {
            if(numOfPapers==0){
                System.out.println("용지가 없습니다.");
            }
            else if(amount%2==0 && numOfPapers<amount/2){
                System.out.println("양면으로 모두 출력하려면 용지가"+(amount/2-numOfPapers)+"장 부족합니다. "+numOfPapers+"장만 출력합니다.");
            }
            else if(amount%2!=0 && numOfPapers<amount/2+1){
                System.out.println("양면으로 모두 출력하려면 용지가"+(amount/2+1-numOfPapers)+"장 부족합니다. "+numOfPapers+"장만 출력합니다.");
            }
            else{
                if(amount%2==0){
                    numOfPapers -= (amount/2);
                    System.out.println("양면으로"+amount/2 + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
                }
                else{
                    numOfPapers -= (amount/2+1);
                    System.out.println("양면으로"+(amount/2+1) + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
                }
            }
        }
    }
    public boolean getDuplex(){
        return duplex;
    }
    public void setDuplex(boolean duplex){
        this.duplex=duplex;
    }
}

public class PrinterTest {
    public static void main(String[] args){
          Printer prn=new Printer(20,true);
          prn.print(25);
          prn.setDuplex(false);
          prn.print(10);


        /*  Printer prn=new Printer(10);
            prn.print(2);
            prn.print(20);
            prn.print(10);*/

            /*prn.numOfPapers+=100;
            prn.print(70);
            System.out.println(prn.numOfPapers);*/
        }

}
