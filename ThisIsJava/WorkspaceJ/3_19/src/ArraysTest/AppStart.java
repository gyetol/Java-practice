package ArraysTest;

import java.util.Arrays;

public class AppStart {
    public static void main(String[] args) {
        Member[] members= {new Member("심청이"),new Member("강감찬"),new Member("을지문덕"),new Member("이순신")};
        Arrays.sort(members);
        for(Member m : members)
        {
            System.out.println(m.getName());
        }
    }
}
