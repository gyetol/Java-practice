package Exception2;

import java.io.IOException;

public class AppStart {
    public static void main(String[] args) throws IOException {
        int n=0;
        try {
            System.out.println("문자 입력:");
            n = System.in.read();
            int a =10 /0;
        }

        catch (IOException e){
            System.out.println("입출력 오류가 발생");
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("연산오류발생");
            e.printStackTrace();
        }
        catch (Exception o){

        }
        finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
