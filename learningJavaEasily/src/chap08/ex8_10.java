package chap08;

import java.util.Arrays;

public class ex8_10 {
    public static void main(String[] args) {
        Rectangle[] rectangles={new Rectangle(3,5),new Rectangle(2,10),new Rectangle(5,5)};

        Arrays.sort(rectangles);

        for(Rectangle r : rectangles)
        {
            System.out.println(r);
        }
    }
}

class Rectangle implements Comparable{
    private int width,height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int findArea(){
        return width*height;
    }

    public String toString(){
        return "사각형[넓이="+width+", 높이="+height+"]";
    }

    public int compareTo(Object o){
        Rectangle other=(Rectangle)o;

        if(this.findArea() < other.findArea()){
            return -1;
        }
        else if(this.findArea() > other.findArea()){
            return 1;
        }
        else{
            return 0;
        }
    }
}

