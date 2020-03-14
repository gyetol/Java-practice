package p1_practice;

public class Stack {
    private Node members;
    private int top;

    public Stack(){
        this.members= null;
        this.top=0;
    }
    public void push(int data){
            members=new Node(data,members);
            top++;
    }
    public int pop(){
        int tmp=members.getData();
        members= members.getNextNode();
        top--;
        return tmp;
    }

    public int getSize(){
        return top;
    }

    boolean isEmpty(){
        return (top==0);
    }

}
