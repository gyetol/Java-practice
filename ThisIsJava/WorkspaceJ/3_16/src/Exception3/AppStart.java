package Exception3;

import java.io.FileInputStream;
import java.io.IOException;

public class AppStart {

    public static int method(int x,int y,int z) throws Exception{
        //처리를 한 후 반환하는 값은 물체의 면적
        return 0;
    }
    public static void func() throws Exception {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            System.out.println("파일개방");
            System.out.println("파일사용");
        } catch (IOException io) {
            System.out.println("파일오류발생");
            throw io; //받아서 다시 쓰로우
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
            } catch (Exception e) {
            }

        }
    }
    public static void read(){
        try{
            func();
        }
        catch (IOException e){
            System.out.println("파일찾기실패");
        }
        catch (Exception e){
            System.out.println("알 수 없는 오류");
        }
    }

    public static void main(String[] args) {

    }
}
