package p1;

public class Manager {
    public final static int DEFAULT_COUNT; //공개는 하되 바꾸진 못한다 대문자로 표시
    private Student[] students;
    private final String managerName; //private이기 때문에 대문자로 표시할 필요가 없다
    private int currentCount;

    static {
        DEFAULT_COUNT=10;
        func();
    }
    public static void func(){

    }

    public Manager(){
        this(DEFAULT_COUNT);
    }
    public Manager(int count){
        this(count,"noname");
    }

    public Manager(int count,String managerName){
        students= new Student[count];
        this.managerName=managerName; //final 변수이지만 객체마다 다른 managerName을 가질 수 있다
        currentCount=0;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getManagerName() {
        return managerName;
    }
    public boolean addStudent(Student student){
        if(currentCount<students.length){
            students[currentCount++]=student;
            return true;
        }
        return false;
    }
    public Student find(String name){
        Student student=null;
        for(int i=0;i<currentCount;i++)
        {
            if(students[i].getName().equals(name)){
                return students[i];
            }
        }
        return null;
    }

    public void showList(){
        for(int i=0;i<currentCount;i++){
            System.out.println(students[i]); //toString이 반환하는 것을 출력함
        }
    }
}
