package chap06;

public class prob03 {
    public static void main(String[] args) {
        Point p=new Point(3,5);
        MovablePoint mp=new MovablePoint(3,5,10,5);
        System.out.println(p.toString());
        System.out.println(mp.toString());
    }
}

class Point{
    private int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

class MovablePoint extends Point{
    private int xSpeed,ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "("+getX()+","+getY()+"),(xSpeed : "+xSpeed+", ySpeed : "+ySpeed+")";
    }
}