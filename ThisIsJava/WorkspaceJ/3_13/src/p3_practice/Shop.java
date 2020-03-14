package p3_practice;

public class Shop {
    public Shop(){

    }
    public Beverage order(String name,boolean addCondiment){
       Beverage beverage=null;
        switch(name)
        {
            case "커피": beverage= new Coffee("커피",2000); break;
            case "홍차": beverage= new Tea("홍차",1500);break;
            default:
                System.out.println("품목에 없는 상품입니다.");break;
        }
        if(beverage!=null){
            beverage.create(addCondiment);
        }
        return beverage;
    }
}
