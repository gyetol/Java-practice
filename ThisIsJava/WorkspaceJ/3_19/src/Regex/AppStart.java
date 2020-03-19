package Regex;
import java.util.regex.Pattern;

public class AppStart {
    public static void main(String[] args){
        if(!PatternChecker.checkEmail("hahaha@naver.com")){
            System.out.println("올바른 메일주소");
        }
        else{
            System.out.println("올바르지 않은 메일주소");
        }
    }
}
