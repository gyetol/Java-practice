package p7_solution;

public class Node {
    private double data;
    private Node next;

    public Node(double data,Node next){
        this.data=data;
        this.next=next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public double getData() {
        return data;
    }
}
