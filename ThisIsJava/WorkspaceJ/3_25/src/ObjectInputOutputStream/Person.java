package ObjectInputOutputStream;

import java.io.Serializable;

public class Person implements Serializable { //직렬화가능한지 여부는 Serializable을 implement를 했는지 여부르 따진다
    public static final long serialVersionUID=1L; //1버전이면 반대쪽도 똑같이 1버전을 가지고 있어야 한다.
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

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}
