package p1;

public class AppStart {
    public static void main(String[] args) {

        Manager manager = new Manager(3,"심청이");
        manager.addStudent(new Student("이순신",100));
        manager.addStudent(new Student("에디슨",98));
        manager.addStudent(new Student("강감찬",95));
        manager.addStudent(new Student("제이슨",70));

        Student find=manager.find("에디슨");
        if(find!=null){
            System.out.println(find);
        }
        else{
            System.out.println("검색실패하였습니다.");
        }

        manager.showList();
    }
}
