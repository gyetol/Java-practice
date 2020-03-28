package lamda;

interface Fightable{
    void fight(String weaponName);
}

class Knight{
    void fight(Fightable f,String weapon){
        f.fight(weapon);
    }

}
public class AppStart2 {
    public static void main(String[] args) {
        Knight k=new Knight();
        k.fight(weaponName -> {
            System.out.println(weaponName+"을 이용하여 싸우는 행위가 호출되었습니다.");
        },"검");
    }
}
