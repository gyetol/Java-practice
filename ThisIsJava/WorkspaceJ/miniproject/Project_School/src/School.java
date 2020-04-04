import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class School {
    private List<Student> students=null;
    private Printable printable=null;

    public School()
    {

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
}
