package TransientTest;

import java.io.Serializable;

public class Box implements Serializable {
    public static  final long serialVersionUID =50000L;

    private int width;
   transient private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public String toString(){
        return "넓이가"+ width+"이며 높이가 "+height+" 면적이 "+(width*height)+"인 사각형";
    }
}
