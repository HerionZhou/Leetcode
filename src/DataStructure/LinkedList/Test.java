package DataStructure.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.get());
        list.put(1);
        list.put(2);
        list.put(3);
        System.out.println(list.size());
        System.out.println(list.get());
        System.out.println(list.get(1));
        System.out.println(list.get(4));
    }
}
