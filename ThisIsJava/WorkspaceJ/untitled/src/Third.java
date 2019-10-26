public class Third {

    static Jumsu getJumsu(){
        return new Jumsu(); //주소를 반환한다
    }

    static int[][] getArray(){
        return new int[3][2]; //주소를 반환한다
    }

    static void func(Integer i){

    }
    public static void main(String[] args) {
        func(10); //Wrapper에 대해서만 call by reference시에 주소가 아닌 값을 보내도 됨
    }
}
