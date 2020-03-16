/*
package localInnerClass;

import org.w3c.dom.ls.LSOutput;
class Reader {
}

public class Student {
    public static final String TYPE="학생";
    public String major;

    public Student(String major){
        this.major=major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public void study(int page){

        page =10;
        page=20;
        class Book extends Reader{

                String bookName;
                int pric;

                Book(String bookName,int pric){
                    this.bookName=bookName;
                    this.pric=pric;
                }
                void show(){
                    System.out.println(page); //final만 참조가능
                    System.out.println(TYPE);
                    System.out.println(Student.this.major);
            }
            Book book = new Book("제3의물결",30000);
            System.out.println("서적명:")
        }
    }
}
*/
