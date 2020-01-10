package chap07;

import java.util.Arrays;

public class prob03 {
    public static void main(String[] args) {
        Book[] b={new Book(15000),new Book(50000),new Book(20000)};
        System.out.println("정렬 전");
        for(Book a:b)
        {
            a.show();
        }
        Arrays.sort(b);
        System.out.println("정렬 후");
        for(Book a:b)
        {
            a.show();
        }
    }
}

class Book{
    int price;
    public Book(int price){
        this.price=price;
    }
    void show(){
        System.out.println("Book [price="+price+"]");
    }
}