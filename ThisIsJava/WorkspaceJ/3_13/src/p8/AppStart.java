package p8;

interface Fightable{ //abstract class Fightable도 가능하다
    public abstract void fight();
}

public class AppStart {
    public static void main(String[] args) {
       Fightable fighter = new Fightable(){ //익명클래스 : Fightable을 구현한(implement한) 클래스를 new했다고 보자
           public void fight(){
               cry();
           }
           public void cry(){
               System.out.println("엉엉");
           }
       };
        fighter.fight();
    }
}
