package DataStructure.HashMap;

public class MyHashMapImpl<K, V> implements MyHashMap<K, V> {
    private Node<K, V>[] buckets;

    public MyHashMapImpl(int size){
        this.buckets = new Node[size * 4];
    }

    @Override
    public void put(K key, V value) {
        //头插法
        int hashValue = key.hashCode() % buckets.length;
        Node<K, V> node = new Node<>(key, value);
        node.next = buckets[hashValue];
        buckets[hashValue] = node;
    }

    @Override
    public V get(K key) {
        int hashValue = key.hashCode() % buckets.length;
        Node<K, V> node = buckets[hashValue];
        while (node != null){
            if (node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static class Node<K, V>{
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
