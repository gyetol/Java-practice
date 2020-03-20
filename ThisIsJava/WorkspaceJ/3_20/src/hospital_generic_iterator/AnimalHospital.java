package hospital_generic_iterator;

public class AnimalHospital<T> extends Hospital<T> {
    private T[] rooms;
    private int count;

    public AnimalHospital(int size){
        super("동물병원");
        rooms = (T[])(new Object[size]);
        count=0;
    }

    public void showList(){
        for(int i=0;i<count;i++){
            System.out.println(rooms[i]);
        }
    }

    public T cure(T obj){
        System.out.println(name+"에 "+obj+"이 입원하였습니다.");
        rooms[count++]=obj;
        return null;
    }

}
