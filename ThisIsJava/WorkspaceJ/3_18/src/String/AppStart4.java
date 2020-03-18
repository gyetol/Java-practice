package String;

import java.util.StringTokenizer;

public class AppStart4 {
    public static void main(String[] args) {
        String str="Hello Java World";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens()+"개의 문자열이 있습니다.");
        while(st.hasMoreElements()){
            System.out.println(st.nextElement());
        }
    }
}
