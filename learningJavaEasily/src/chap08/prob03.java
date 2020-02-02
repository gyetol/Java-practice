package chap08;

public class prob03 {
    public static void main(String[] args) {
        conversation(new Korean());
        conversation(new American());
    }
}

interface Talkable{
    void talk();
}
