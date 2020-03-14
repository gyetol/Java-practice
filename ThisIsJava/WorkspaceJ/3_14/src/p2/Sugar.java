package p2;

public class Sugar extends Decorator {
    public static final String PDNAME ="설탕";
    public static final int PDCOST=200;

    public Sugar(Beverage beverage){
        super(beverage,PDNAME,PDCOST);

    }
}
