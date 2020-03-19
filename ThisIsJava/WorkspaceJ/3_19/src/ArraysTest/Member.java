package ArraysTest;

public class Member implements Comparable<Member>{
    private String name;

    public Member(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Member member) {

        return -(this.name.compareTo(member.name)); //name은 String 타입이라 compareTo가 구현되어 있다
    }
}
