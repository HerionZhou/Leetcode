package Algorithm.SwordToOffer;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode146 {
    //LRU，使用LinkedHashMap
    static class LRUCache {
        Map<Integer, Integer> cache = new LinkedHashMap<>();
        int capacity;
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if (cache.containsKey(key)){
                int value = cache.get(key);
                cache.remove(key);
                cache.put(key, value);
                return value;
            }else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)){
                cache.remove(key);
                cache.put(key, value);
            }
            if (cache.size() < capacity){
                cache.put(key, value);
            }else {
                int oldestKey = cache.keySet().iterator().next();
                cache.remove(oldestKey);
                cache.put(key, value);
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
    }

}
