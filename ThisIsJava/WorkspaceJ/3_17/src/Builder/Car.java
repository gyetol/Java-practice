package Builder;

public class Car {
    private String name;
    private String color;
    private int disp;

    public Car(String name,String color,int disp){
        this.name=name;
        this.color=color;
        this.disp=disp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDisp(int disp) {
        this.disp = disp;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getDisp() {
        return disp;
    }

    @Override
    public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("차종:"+name+"\n").append("색상:"+color+"\n").append("배기량:"+disp+"\n");
    return sb.toString();
    }
}
