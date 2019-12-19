package chap04;
//prob05
public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);
    }
}

class Line {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public boolean isSameLine(Line line){
        return this.length==line.length;
    }

}
