package chap07;

public class prob04 {
    public static void main(String[] args) {
        TalkableTest.speak(new Korean());
        TalkableTest.speak(new American());
    }
}

class TalkableTest{
    public static void speak(Object o){
        if(o instanceof Korean){
            ((Korean) o).talk();
        }
        else if(o instanceof American){
            ((American) o).talk();
        }
        else{
            System.out.println("말할 수 없어요..!");
        }
    }
}

interface Talkable{
    public abstract void talk();
}

class Korean implements Talkable{
    public void talk(){
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable{
    public void talk(){
        System.out.println("Hello");
    }
}
