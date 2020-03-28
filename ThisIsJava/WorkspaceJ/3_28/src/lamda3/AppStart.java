package lamda3;

import java.util.Comparator;

public class AppStart {
    public static void main(String[] args) {

        Box b =new Box(100,100);
        b.setComparator(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getArea()-o2.getArea();  //면적비교
            }
        });

        b.setComparator((o1,o2)->{return o1.getHeight()-o2.getWidth();}); //높이비교

        b.setComparator((Comparator.comparingInt(Box::getWidth))); //넓이비교

        b.setComparator(new Comparator<Box>(){ //면적비교해서 같으면 넓이비교, 넓이비교해서 같으면 높이비교, 높이까지 같으면 같다
            public int compare(Box o1,Box o2){
                if(o1.getArea()>o2.getArea()){return 1;}
                else if(o1.getArea()<o2.getArea()){return -1;}
                else{
                    if(o1.getWidth()>o2.getWidth()){return 1;}
                    else if(o1.getWidth()<o2.getWidth()){return -1;}
                    else{
                        if(o1.getHeight()>o2.getHeight()){return 1;}
                        else if(o1.getHeight()<o2.getHeight()){return -1;}
                        else{return 0;}
                    }
                }
            }
        });


    }
}
