package Adaptor;

public class Duck_likeTurkey extends Duck{
    private Turkey turkey;

    public Duck_likeTurkey(){
        turkey=new Turkey();
    }

    public void quack(){
        this.turkey.gobble(); //delegation(위임)
    }
}
