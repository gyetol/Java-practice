/*
package generic2;

*/
/*public class Course<T> { //unbounded type => Object타입으로 본다*//*

*/
/*public class Course<Person> { //Person타입*//*

public class Course<T extends Student> { //bounded type => Student타입이하로 본다(상한타입을 지정함) 그니까 잠정적인 타입은 Student
    private String courseName;
    private T[] students;
    private int count;


    public Course(String courseName,int capacity){
       */
/* students= (T[])(new Object[capacity]);*//*

        students= (T[])(new Student[capacity]); //잠정적 상한타입으로 만들어야 한다.

        this.courseName = courseName;
        this.count=0;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setStudents(T[] Students){
        this.students=students;
    }
    public String getCourseName(){
        return this.courseName;
    }

    public T[] getStudents() {
        return students;
    }

    public int getCount() {
        return count;
    }

    public void add(T student){

        try{
            if(count==students.length){
            throw new FullException();
        }
            this.students[count++]=student;
        }
        catch (CourseException e){
            System.out.println(e.getMessage());
            e.doExcept(this);
            this.students[count++]=student;
            //this.add(student);//재귀호출 -> finally절에서 뭔가 수행하는것이 있으면 재귀호출쓰지마라!! 안그러면 finally가 여러번 수행이된다.
        }
        finally {
            ;
        }
    }

 */
/*   private<K extends Student> void show(K obj){
        System.out.println(obj.getName()+": "+obj.getMajor());
    }

    public void showList(){
        for(T obj:students){
            if(obj==null){
                break;
            }
            this.show(obj);
            System.out.println(obj.getName()+":"+obj.getMajor()); //잠정적인 타입이 Student임으로 getName()가능
        }
    }*//*


    */
/*public void show(){
        System.out.println(student.getName());
    }*//*

}*/
