package Adaptor;

public class AppStart {
    public static void main(String[] args) {
        Duck[] ducks={
          new Duck(),
          new Duck_likeTurkey()
        };
        ducks[0].quack();
        ducks[1].quack();
    }
}
