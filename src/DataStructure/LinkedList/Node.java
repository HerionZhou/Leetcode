package DataStructure.LinkedList;

public class Node {
    private int val;
    private Node next;

    public Node(int x){
        next = null;
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
