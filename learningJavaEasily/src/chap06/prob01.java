package chap06;

public class prob01 {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        ColoredCircle cc=new ColoredCircle(10,"빨간색");
        c.show();
        cc.show();
    }
}

class Circle{
   private int radius;
    void show(){System.out.println("반지름이 "+radius+"인 원이다.");}
    public Circle(int radius){
        this.radius=radius;
    }
}

class ColoredCircle extends Circle{
    String color;
    void show(){System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");}
    public ColoredCircle(int radius,String color){
        super(1); //부모객체에서 radius를 가져오네~
       // this.radius=radius;
        this.color=color;
    }
}

