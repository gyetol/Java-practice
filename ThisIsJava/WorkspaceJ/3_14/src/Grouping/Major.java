package Grouping;

public class Major {
    private String major;
    private int achievement;

    public Major(String major){
        this.major=major;
        this.achievement=0;
    }
    public Major(String major,int achievement){
        this.major=major;
        this.achievement=achievement;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setAchievement(int achievement) {
        this.achievement = achievement;
    }

    public String getMajor() {
        return major;
    }

    public int getAchievement() {
        return achievement;
    }


}
