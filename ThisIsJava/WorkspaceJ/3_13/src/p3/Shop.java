package p3;

public class Shop {
    public Beverage order(String name,boolean addCondiment){
        Beverage beverage = null;
        switch(name){
            case "커피":
                beverage= new Coffee();
                break;
            case "홍차":
                beverage=new Tea();
                break;
            default:
                 break;
        }
        if(beverage!=null){
            beverage.create(addCondiment);
        }
        else{
            System.out.println(name+"은 본 점에서는 취급하지 않는 품목입니다.");
        }
        return beverage;
    }
}
