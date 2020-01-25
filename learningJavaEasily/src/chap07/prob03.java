package chap07;

import java.util.Arrays;

public class prob03{
    public static void main(String[] args) {
        Book books[]={new Book(15000),new Book(50000),new Book(20000)};
        System.out.println("정렬 전");
        for(Book b:books)
        {
            System.out.println("Book [price="+b.price+"]");
        }
        System.out.println("정렬 후");
        Arrays.sort(books);
        for(Book b:books)
        {
            System.out.println("Book [price="+b.price+"]");
        }
    }
}

class Book implements Comparable{
    int price;
    public Book(int price) {
        this.price = price;
    }
    public int compareTo(Object o){
        Book b=(Book) o;
        if(this.price>b.price){
            return 1;
        }
        else if(this.price<b.price){
            return -1;
        }
        else{
            return 0;
        }
    }
}











/*

import java.util.Arrays;
import java.util.Comparator;

public class prob03 {
    public static void main(String[] args) {
        Book[] b = {new Book(15000), new Book(50000), new Book(20000)};
        System.out.println("정렬 전");
        for (Book a : b) {
            a.show();
        }
        // 1 : Comparable을 구현한 클래스인 경우
        // Arrays.sort(b);

        // 2 : Comparator 객체를 만들어서 전달인자로 보내주는 경우
        Comparator<Book> comparatorBook = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.price, b2.price);
            }
        };
        Arrays.sort(b, comparatorBook);


        // 3 : sort 메서드 전달인자로 직접 Comparator 익명 클래스를 구현한 경우
        Arrays.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.price, b2.price);
            }
        });

        // 4 : 익명 클래스를 람다로 바꿈
        Arrays.sort(b, (b1, b2) -> Integer.compare(b1.price, b2.price));

        System.out.println("정렬 후");
        for (Book a : b) {
            a.show();
        }
    }
}

// 1의 경우
//class Book implements Comparable {
//    int price;
//
//    public Book(int price) {
//        this.price = price;
//    }
//
//    void show() {
//        System.out.println("Book [price=" + price + "]");
//    }
//
//    public int compareTo(Object other) {
//        if (other == null) return -2; // -2일 경우 오류 처리
//        if (!(other instanceof Book)) {
//            return -2;
//        }
//        Book book = (Book)other;
//
//        return Integer.compare(this.price, book.price);
////        if (this.price > book.price) {
////            return 1;
////        }
////        else if (this.price < book.price) {
////            return -1;
////        }
////        return 0;
//
//    }
//}

// 2, 3, 4의 경우
class Book {
    int price;

    public Book(int price) {
        this.price = price;
    }

    void show() {
        System.out.println("Book [price=" + price + "]");
    }
}*/
