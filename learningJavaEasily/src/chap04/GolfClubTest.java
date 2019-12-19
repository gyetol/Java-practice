package chap04;
//prob07
public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1= new GolfClub();
        g1.print();

        GolfClub g2= new GolfClub(8);
        g2.print();

        GolfClub g3= new GolfClub("퍼터");
        g3.print();
    }
}

class GolfClub{
    private int ironNum;
    private String kindOfIron;
    private boolean special=false;

    public GolfClub(){
        this.ironNum=7;
    }
    public GolfClub(int ironNum){
        this.ironNum=ironNum;
    }
    public GolfClub(String kindOfIron){
        this.kindOfIron=kindOfIron;
        this.special=true;
    }
   public void print(){
        if(special==true){
            System.out.println(kindOfIron+"입니다.");
        }
        else {
            System.out.println(ironNum + "번 아이언입니다.");
        }
    }
}
