package lamda3;

import java.util.Comparator;

public class Box implements Comparable<Box>{
    private int width;
    private int height;
    Comparator<Box> comparator;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        this.comparator=null;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setComparator(Comparator<Box> comparator) {
        this.comparator = comparator;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public int getArea(){
        return (width*height);
    }

    public Comparator<Box> getComparator() {
        return comparator;
    }

    @Override
    public int compareTo(Box obj) {
       return comparator.compare(this,obj);
    }
}
