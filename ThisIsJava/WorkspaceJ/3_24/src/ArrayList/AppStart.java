package ArrayList;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {
        /*ArrayList al=new ArrayList(3); //타입을 명시하지 않았으므로 Object타입이 되었다.*/
        ArrayList<Integer> al =new ArrayList<>(3);
        al.add(10);
        al.add(0,20);
        al.add(1,30);
        al.add(0,50);
       // al.add(0,50.0); //new Double로 가기 때문에 저장될 수 없다.
        al.add(0,(int)50.0);


        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i)); // al.get()한 것의 타입은 Object타입이다.
        }


        Person a = new Person("이순신");
        Person b = new Person("이순신");
        if(a==b){
            System.out.println("주소같음");
        }
        else{
            System.out.println("주소다름");
        }

        if(a.equals(b)){
            System.out.println("동일한 멤버 데이터");
        }
        else{
            System.out.println("동일하지 않은 멤버 데이터");
        }

        ArrayList<Person> persons=new ArrayList<>();
        persons.add(new Person("홍길동"));
        persons.add(new Person("심청이"));
        persons.add(new Person("이순신"));
      if ( persons.remove(new Person("이순신")))
      {
          System.out.println("이순신 삭제성공");
      }
      else
      {
          System.out.println("이순신 삭제실패");
      }

        for(Person p : persons)
        {
            System.out.println(p);
        }
    }
}
