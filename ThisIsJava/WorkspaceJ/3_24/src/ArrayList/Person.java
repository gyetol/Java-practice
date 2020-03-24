package ArrayList;

public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"@"+name;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){return false;}
        if(this.getClass().getName()!=o.getClass().getName()){return false;}

        if(this.name==null){
            if(((Person)o).getName()==null){return true;}
            else{
                return false;
            }
        }
        else{
            if(((Person)o).getName()==this.name){return true;}
            else{return false;}
        }

      /* Person obj=(Person)o;
       if(name!=null){
           if(!name.equals(obj.name)){return false;}
       }
       else{
           if(obj.name!=null)
       }*/
    }
}
