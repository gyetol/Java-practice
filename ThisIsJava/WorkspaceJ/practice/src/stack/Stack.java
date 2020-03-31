package stack;

public class Stack {
    private int[] data;
    private int count;

    public Stack(int size){
        data= new int[size];
        count=0;
    }

    public void push(int num){
        if(count<data.length){
            data[count++]=num;
            System.out.println("입력성공!");
        }
        else{
            System.out.println("저장공간이 없어서 입력실패...");
        }
    }
    public int pop(){
        int tmp= data[count-1];
        count--;
        return tmp;
    }

    public int getCount(){
        return count;
    }
}
