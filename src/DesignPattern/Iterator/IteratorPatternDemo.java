package DesignPattern.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        MyList list = new MyList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
