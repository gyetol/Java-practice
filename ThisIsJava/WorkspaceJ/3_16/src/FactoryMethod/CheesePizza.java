package FactoryMethod;

public class CheesePizza  extends Pizza{
    public static final String NAME="치즈";
    public CheesePizza(){
        super(NAME);
    }

    @Override
    public String getDescript() {
        return name;
    }
}
