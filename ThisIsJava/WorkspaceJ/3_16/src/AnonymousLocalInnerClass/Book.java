package AnonymousLocalInnerClass;

public abstract class Book {
    protected String title;
    protected int price;

    public Book(String title,int price){
        this.title=title;
        this.price=price;
    }
    public Book(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
    public abstract void showInfo();
}
