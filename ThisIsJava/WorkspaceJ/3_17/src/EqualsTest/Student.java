package EqualsTest;

public class Student extends Person{
    private String major;
    private int jumsu;

    public Student(String name,int age,String major,int jumsu){
        super(name,age);
        this.major=major;
        this.jumsu=jumsu;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setJumsu(int jumsu) {
        this.jumsu = jumsu;
    }

    public String getMajor() {
        return major;
    }

    public int getJumsu() {
        return jumsu;
    }

    @Override
    public String getDiscript() {
        StringBuffer sb=new StringBuffer();
        sb.append("이름: "+name+"\n").append("연령: "+age+"\n").append("전공: "+major+"\n").append("점수: "+jumsu+"\n");
        System.out.println(sb);
        return sb.toString();
    }

    public boolean equals(Object o){
        if(!super.equals(o)){return false;}
        if(!(o instanceof Student)){return false;}
        Student obj=(Student)o;
        if(this.major!=null){
            if(obj.major==null){return false;}
            else{
                if(!this.major.equals(obj.major)){return false;}
            }
        }
        else{
            if(obj.major!=null){return false;}

        }
        if(this.jumsu!=obj.jumsu){
            return false;
        }
        return true;
    }
}
