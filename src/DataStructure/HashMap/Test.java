package DataStructure.HashMap;

public class Test {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMapImpl<>(10);
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(2));
    }
}
