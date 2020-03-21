package generic2;

public final class CollegeStudent extends Student {
    public static final String TYPE="대학생";
    private int grade;

    public CollegeStudent(String name,String major,int grade){
        super(name,major);
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return super.toString()+":"+getGrade();
    }
}
