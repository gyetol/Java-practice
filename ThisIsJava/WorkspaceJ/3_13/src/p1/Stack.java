package p1;

public class Stack {
    private Node members;
    private int top;

    public Stack(){
        this.members= null;
        this.top=0;
    }

    public void push(int value){
        top++;
        members = new Node(value,members);
    }

    public int pop(){
        top--;
        int tmp= members.getData();
        members=members.getNextNode();
        return tmp;
    }

    public int getSize(){
        return top;
    }

    public boolean isEmpty(){
        return (top ==0);
    }
}
