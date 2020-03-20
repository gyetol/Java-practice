package generic;

class Box<T>{
    T member;

    public Box(T member){
        this.member=member;
    }
    public void setMember(T member){
        this.member=member;
    }
    public T getMember(){
        return this.member;
    }
}
public class AppStart {

    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>(new Integer(10));
        System.out.println(box.getMember());
    }
}
