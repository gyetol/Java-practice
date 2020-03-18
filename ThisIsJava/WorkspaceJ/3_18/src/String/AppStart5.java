package String;
import java.util.Map;
import java.util.StringTokenizer;

public class AppStart5 {
    public static void main(String[] args) {
        Map<String,String> env=System.getenv();
        String path=env.get("Path");
        StringTokenizer st = new StringTokenizer(path,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
