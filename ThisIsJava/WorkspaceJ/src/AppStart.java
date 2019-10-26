class Person{
   private String name;
   private int gender;

   public Person(){
        this("noname");//String타입 하나를 인수로 하는 생성자 호출
       // this("noname",20);  -> 생성자는 가장 첫 줄에만 쓸 수 있다 . 따라서 자동으로 2개 이상 생성자호출 못한다.
    }
    public Person(String name){
        this(name,20);
    }
    public Person(String name,int gender){
        this.name=name;
        this.gender=gender;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public void showInfo(){
       System.out.println("이름:"+name);
       System.out.println("세대:"+gender);

    }
}


public class AppStart {
    public static void main(String[] args) {
        Person p = new Person("심청이"); //p는 주소다. p는 객체변수
        Person p2=new Person("홍길동");
        p.setName("홍길동"); //80번지의 name에 "홍길동"을 넣는다
        p2.setName("심청이"); //90번지의 name에 "심청이"를 넣는다
        p2.setName("심청이") ;
        p.setGender(2);
        p.showInfo();
        p2.showInfo();
    }
}
