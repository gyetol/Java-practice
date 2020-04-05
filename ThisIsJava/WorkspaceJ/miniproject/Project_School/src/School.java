import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class School {
    private List<Student> students=null;
    private Printable printable=null;

    public School()
    {

    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setPrintable(Printable printable) {
        this.printable = printable;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Printable getPrintable() {
        return printable;
    }

    public void addStudent(Student student) {
        if(student==null){
            System.out.println("넣을 대상이 없습니다.");
            return;
        }
        if(!(searchStudent(student)==-1)){
            students.add(student);
            System.out.println("추가성공");
        }
        else{
            System.out.println("추가실패");
        }
    }

    public void removeStudent(Student student){
        int idx=-1;
        if(student==null){
            System.out.println("삭제 대상을 지정해주세요");
            return;
        }
        if((idx=searchStudent(student))==-1){
            System.out.println("해당하는 학생이 목록에 없습니다");
            return;
        }
        else{
            students.remove(idx);
            System.out.println("해당학생을 성공적으로 삭제했습니다.");
        }
    }

    public List<Student> searchByName(String name){
        if(name==null || name==" "){
            System.out.println("이름을 지정해주세요");
            return null;
        }
        List<Student> searchedList= new ArrayList<>();
        for(Student st: students) {
            if (st.getName().equals(name)){
                searchedList.add(st);
            }
        }
        if(searchedList.size()!=0){return searchedList;}
        else{return null;}
    }
    public List<Student> searchByMajor(String major){
        if(major==null || major==" "){
            System.out.println("전공을 지정해주세요");
            return null;
        }
        List<Student> searchedList = new ArrayList<>();
        for(Student st : students){
            if(st.getMajor().equals(major)){
                searchedList.add(st);
            }
        }
        if(searchedList.size()!=0){return searchedList;}
        else{return null;}
    }

    public Student searchByNumber(int number){
        if(Math.log10(number)!=8){
            System.out.println("유효한 학번이 아닙니다. 학번은 8자리여야 합니다");
            return null;
        }
        for(Student st: students){
            if(st.getNumber()==number){
                return st;
            }
        }
        System.out.println("찾지 못했습니다.");
        return null;
    }

    private int searchStudent(Student student){
        int idx=0;
        if(student==null){return -1;}
        Iterator<Student> it= students.iterator();
        while(it.hasNext())
        {
            if(it.next().equals(student))
            {
                return idx;
            }
            idx++;
        }
        return -1;
    }

    public void printList(List list){
        printable.print(list);
    }
}
