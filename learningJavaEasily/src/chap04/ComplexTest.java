package chap04;
//prob06
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1=new Complex(2.0);
        c1.print();
        Complex c2=new Complex(1.5,2.5);
        c2.print();
    }
}

class Complex{
    private double realNum;
    private double imagineNum;

    public Complex(double realNum){
        this.realNum=realNum;
        this.imagineNum=0.0;
    }
    public Complex(double realNum,double imagineNum){
        this.realNum=realNum;
        this.imagineNum=imagineNum;
    }

    public double getRealNum() {
        return realNum;
    }

    public double getImagineNum() {
        return imagineNum;
    }

    public void print(){
        System.out.println(this.getRealNum()+" + "+this.getImagineNum()+"i");
    }
}
