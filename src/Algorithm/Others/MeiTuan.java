package Algorithm.Others;

import java.util.*;

public class MeiTuan {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        while (nums-- > 0){
            int key = sc.nextInt();
            int value = sc.next().equals("L") ? -1 : 1;
            map.put(key, value);
            if (value == 1 && key< right) {
                right = key;
            }else if (value == -1 && key > left) {
                left = key;
            }
        }

        while (left > right){
            Set set = map.entrySet();
            for (Object o : set ){
                Map.Entry entry = (Map.Entry) o;
                int key = (int) entry.getKey();
                int moveDirection = (int) entry.getValue();
                key = key + moveDirection;
                if (map.containsKey(key)){

                }
            }
        }

    }
}
