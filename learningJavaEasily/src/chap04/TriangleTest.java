package chap04;
//prob01~02
class Triangle{
    private double width,height;

    public Triangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    double findArea(){
        return width*height/2;
    }
    boolean isSameArea(Triangle tr){
        return this.findArea()==tr.findArea();
    }

}

public class TriangleTest {
    public static void main(String[] args){
        Triangle t1= new Triangle(10.0,5.0);
        Triangle t2= new Triangle(5.0,10.0);
        Triangle t3= new Triangle(8.0,8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

        // System.out.println(t1.findArea());
    }
}
