package AbstractFactoryPattern;

public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;

    public Pizza(Dough dough, Sauce sauce, Cheese cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("피자 재료 표기\n");
        sb.append("반죽:"+dough.toString()+"\n");
        sb.append("소스:"+sauce.toString()+"\n");
        sb.append("치즈:"+cheese.toString()+"\n");
        return sb.toString();
    }
}
