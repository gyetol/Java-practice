package Wrapper;

//Wrapper는 전달된 인수를 조작할 수 없다

public class AppStart {
    public static void func(Integer i){ //i는 새로운 공간
        i=200;
    }
    public static void sFunc(String s){
        s="심청이";
    }

    public static void main(String[] args) {
        Integer a =100; //a라는 공간 생성
        String str="홍길동";
        func(a);
        System.out.println(a);
        sFunc(str);
        System.out.println(str);
    }
}
