package Regex;
import java.util.regex.Pattern;

public class PatternChecker {
    public static String regexPhoneNumber1="0{1}(2|[1-9]{1,2})-[0-9]{3,4}-[0-9]{4}";
    public static String regexEmail1="[a-z][\\w_]*@\\w[\\w_]*.((com|net)|((co|ac).(kr|jp)))";

    public static void setRegexPhoneNumber1(String regexPhoneNumber1) {
        PatternChecker.regexPhoneNumber1 = regexPhoneNumber1;
    }

    public static void setRegexEmail1(String regexEmail1) {
        PatternChecker.regexEmail1 = regexEmail1;
    }

    public static String getRegexPhoneNumber1() {
        return regexPhoneNumber1;
    }

    public static String getRegexEmail1() {
        return regexEmail1;
    }

    public static boolean checkPhoneNumber(String phoneNumber){
        return Pattern.matches(regexPhoneNumber1,phoneNumber);
    }

    public static boolean checkEmail(String email){
        return Pattern.matches(regexEmail1,email);

    }
}
