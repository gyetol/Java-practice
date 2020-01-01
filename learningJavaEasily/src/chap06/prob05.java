package chap06;

public class prob05{
    public static void main(String[] args) {
        Phone[] phones={new Phone("황진이"),new TelePhone("길동이","내일"),new Smartphone("민국이","갤러그")};
        for(Phone p:phones)
        {
            if(p instanceof Smartphone){((Smartphone)p).playGame();}
            else if(p instanceof TelePhone){ ((TelePhone)p).autoAnswering();}
            else{p.talk();}
        }
    }
}

class Phone{
    protected String owner;
    public Phone(){}
    public Phone(String owner){
        this.owner=owner;
    }
    public void talk(){
        System.out.println(owner+"가 통화중이다.");
    }
}

class TelePhone extends Phone{
    private String when;
    public TelePhone(){}
    public TelePhone(String owner,String when){
        super(owner);
        this.when=when;
    }
    public void autoAnswering(){
        System.out.println(owner+"가 없다. "+when+" 전화 줄래.");
    }
}

class Smartphone extends TelePhone{
    private String game;
    public Smartphone(String owner,String game){
        this.owner=owner;
        this.game=game;
    }
    public void playGame(){
        System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");
    }
}
