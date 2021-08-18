package DataStructure.LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public void put(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            size = 1;
        }else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            size++;
        }
    }

    public int get(){
        if (head == null){
            NullPointerException e = new NullPointerException("链表为空");
            throw e;
        }
        return head.getVal();
    }

    public int get(int index){
        if (index > size - 1){
            ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("越界了");
            throw e;
        }
        Node temp = head;
        int res = temp.getVal();
        while (index != 0){
            temp = temp.getNext();
            res = temp.getVal();
            index--;
        }
        return res;
    }

    public int size() {
        return size;
    }
}
