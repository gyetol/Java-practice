package lamda2;

import java.util.Comparator;

public class AppStart {
    public static void main(String[] args){
        lamda3.Box b1 =new lamda3.Box(10,10);
        lamda3.Box b2 =new lamda3.Box(11,9);



        //b1과 b2의 면적을 비교하는 람다식을 작성,  b1의 면적이 더 크면 양의값, b2의 면적이 더 크면 음의 값
        /*Comparator<lamda3.Box>=new Comparator<lamda3.Box>{
            public void compare(b1,b2){

            }
        };*/

        Comparator<lamda3.Box> comp=(abox, bbox)->{
            return abox.getArea()>bbox.getArea()?abox.getArea():bbox.getArea();
        };

        if(comp.compare(b1,b2)>0){
            System.out.println("b1박스가 더큽니다");
        }
        else if(comp.compare(b1,b2)<0){
            System.out.println("b2박스가 더큽니다");
        }
        else{
            System.out.println("면적이 같습니다");
        }


    }
}
