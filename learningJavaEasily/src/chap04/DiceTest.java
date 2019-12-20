package chap04;
//prob08
public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
        System.out.println(Math.random());
    }
}

class Dice{
    private int face;

    public int roll(){
        while(this.face>=0) {
            this.face = (int) ((Math.random() - 0.6) * 10);
        } //this.face>=0 에서 등호를 빼버리면 this.face가 0으로 초기화 되어있으므로 애초에 while문에 들어가지도 못한다.
        this.face+=7;
        return this.face;
    }
}
