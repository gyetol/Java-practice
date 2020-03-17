package EqualsTest;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o){


        if(o==null) { //인수에 대한 null체크
            return false;
        }
        if(!(o instanceof Person)){   //if(!this.getClass().getName().equals(o.getClass().getName())) //타입비교
            return false;
        }
        Person obj=(Person)o; //타입캐스팅
        if(this.name!=null){  //String 멤버 null 체크
            if(obj.name==null){ //this는 객체, obj가 null일경우
                return false;
            }
            else{ //this도 객체, obj도 객체
                if(!(this.name.equals(obj.name))){ //값을 비교
                    return false;
                }
            }
        }
        else{  //this의 멤버가 null이다
            if(obj.name!=null){ //값에 상관없이 비교대상이 null아니다
                return false;
            }
        }
        if(this.age!=obj.age){return false;} //기본자료형의 비교
        return true;
    }
    public abstract String getDiscript();
}
