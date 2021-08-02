package SwordToOffer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LeetCode146 {
    //LRU，使用LinkedHashMap
    static class LRUCache {
        HashMap<Integer, Integer> cache;
        LinkedList<Integer> lru;
        int count;
        public LRUCache(int capacity) {
            this.cache = new HashMap<>();
            this.lru = new LinkedList<>();
            this.count = capacity;
        }

        public int get(int key) {
            if (!lru.contains(key)) return -1;
            lru.remove(lru.indexOf(key));
            lru.addLast(key);
            return cache.get(key);
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)){
                cache.replace(key, value);
                lru.remove(lru.indexOf(key));
                lru.addLast(key);
            }else {
                if (count > 0){
                    cache.put(key, value);
                    lru.addLast(key);
                    count--;
                }else {
                    cache.remove(lru.removeFirst());
                    cache.put(key, value);
                    lru.addLast(key);
                }
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(1));
        LinkedHashMap<Integer, Integer> test = new LinkedHashMap<>();
    }

}
