package Hashcode;

public class Person {
   String name;
   int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode() {
        int prime=31;
        int result=1;
        result=prime*result+(name==null?0:name.hashCode());
        result=prime*result+age;
        return result;
    }
}
