enum Country{
   KOREA("대한민국"),AMERICA("미국"),CANADA("캐나다"),ENGLAND("영국");
   private String name;
   private Country(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
}

public class D3_1 {
    public static void main(String[] args) {
        Country c =Country.KOREA; //변수에 대입을 하는 순간 인스턴스가 생성(생성자 호출한다)
        System.out.println(c);
        System.out.println(c.getName());
        c=Country.AMERICA;
        System.out.print(c);

    }
}
