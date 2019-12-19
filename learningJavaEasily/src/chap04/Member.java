package chap04;
//prob03
public class Member {
    private String name,id,password;
    private int age;

    public Member(String name,String id,String password,int age){
        this.name=name;
        this.id=id;
        this.password=password;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getPassword() {
        return this.password;
    }
    public int getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
