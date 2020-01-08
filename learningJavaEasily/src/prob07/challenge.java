package prob07;

public class challenge {
    public static void main(String[] args) {
        Countable[] m={new Bird("뻐꾸기"),new Bird("독수리"),new Tree("사과나무"),new Tree("밤나무")};

        for(Countable e : m)
        {
            e.count();
        }
        for(int i=0;i<m.length;i++)
        {
            if(m[i] instanceof Bird){
                ((Bird)m[i]).fly();
            }
            else{
                ((Tree)m[i]).ripen();
            }
        }
    }
}

interface Countable{
     public abstract void count();
}

class Bird implements Countable{
    String name;
    static int num;
    public Bird(String name){
        this.name=name;
        this.num++;
    }
    public void count(){
        System.out.println(name+"가 "+num+"마리 있다.");
    }
    public void fly(){
        System.out.println(num+"마리 "+name+"가 날아간다.");
    }
}

class Tree implements Countable{
    String name;
    static int num=0;
    public Tree(String name){
        this.name=name;
        this.num++;
    }
    public void count(){
        System.out.println(name+"가 "+num+"그루 있다.");
    }
    public void ripen(){
        System.out.println(name+"에 열매가 잘 익었다.");
    }
}
