package EqualsTest;

public class Manager {
    private Student student;

    public Manager(Student student){
        this.student=student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){return false;}
        if(!(o instanceof Manager)){return false;}
        Manager obj=(Manager)o;
        if(this.student!=null){
            if(!(this.student.equals(obj.student))){return false;}
        }
        else{
            if(obj.student!=null){return false;}
        }
       return true;
    }
}
