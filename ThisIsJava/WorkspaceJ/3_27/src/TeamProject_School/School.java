/*
package TeamProject_School;

import java.util.LinkedList;
import java.util.List;

public class School {
    private List<Student> students;
    private Printable printMethod;
    private int count;

    public School() {
        students=new LinkedList<Student>();
        count=0;
    }

    public boolean addStudent(Student student) {
        if(count!=0) {
            if(searchByNumber(student.getNumber())!=null) {return false;}
        }
        students.add(count,student);
        return true;
    }

    public boolean removeStudent(int number) {
        if(count==0) {
            System.out.println("목록에 아무도 없습니다.");
            return false;
        }
        else {

        }
    }

    public Student[] searchByName(String name) {
        Student[] ansArray=new Student[count];
        int ansArrayCount=0;

        for(int i=0;i<count;i++) {
            Student temp=students.get(i);
            if(temp.getName().equals(name)) {
                ansArray[ansArrayCount]=temp;
                ansArrayCount++;
            }
        }
        if(ansArrayCount!=0) {return ansArray;}
        else{
            return null;
        }
    }
    public Student[] searchByMajor(String major) {
        Student[] ansArray=new Student[count];
        int ansArrayCount=0;

        for(int i=0;i<count;i++) {
            Student temp=students.get(i);
            if(temp.getMajor().equals(major)) {
                ansArray[ansArrayCount]=temp;
                ansArrayCount++;
            }
        }
        if(ansArrayCount!=0) {return ansArray;}
        else{
            return null;
        }
    }
    public Student searchByNumber(int number) {
        for(int i=0;i<count;i++) {
            Student temp=students.get(i);
            if(temp.getNumber()==number) {
                return temp;
            }
        }
        return null;
    }

    public void setPrintMethod(Printable printMethod) {this.printMethod=printMethod;}
    public Printable getPrintMehtod() {return this.printMethod;}
    public List<Student> getStudetns() {return students;}
    public void printList() {
        this.printMethod.print();
    }

}
*/
