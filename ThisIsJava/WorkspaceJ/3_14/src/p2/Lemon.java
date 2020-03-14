package p2;

public class Lemon extends Decorator {
    public static final String PDNAME="레몬";
    public static final int PDCOST=500;

    public Lemon(Beverage beverage){
        super(beverage,PDNAME,PDCOST);
    }
}
