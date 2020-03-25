package Pattern_ObjectInOutstream;

public class Person implements java.io.Serializable {
    public static final long serialVersionUID =1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){return false;}
        if(!o.getClass().getName().equals(this.getClass().getName())){return false;}
        Person obj = (Person)o;
        if(obj.name==null)
        {
            if(this.name==null)
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(this.name.equals(obj.name)){
                return true;
            }
            else{
                return false;
            }
        }

    }

    @Override
    public int hashCode() {
        int prime=31;
        int code=1;
        code=prime*code+(this.name!=null?this.name.hashCode():0);
        code=prime*code+this.age;

        return code;
    }
}
