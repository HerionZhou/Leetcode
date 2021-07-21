package LearnJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap();
        map.put(1, "java");
        map.put(2, "jdk");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
        map.forEach((key, value) ->{
            System.out.println(key);
            System.out.println(value);
        });
        map.entrySet().parallelStream().forEach(entry -> {
            System.out.println(entry.getValue());
        });
    }
}
