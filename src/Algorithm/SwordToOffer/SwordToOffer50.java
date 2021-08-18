package Algorithm.SwordToOffer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SwordToOffer50 {
    static class Solution{
        //哈希表
        public char algorithm(String s){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++){
                if (!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), 1);
                }else {
                    int temp = map.get(s.charAt(i));
                    map.put(s.charAt(i), temp + 1);
                }
            }
            for (int i = 0; i < s.length(); i++){
                if (map.get(s.charAt(i)) == 1) return s.charAt(i);
            }
            return ' ';
        }
        //有序哈希表
        public char algorithm1(String s){
            HashMap<Character, Boolean> map = new LinkedHashMap<>();
            char[] str = s.toCharArray();
            for (char c : str){
                map.put(c, !map.containsKey(c));
            }
            for (Map.Entry<Character, Boolean> entry : map.entrySet()){
                if (entry.getValue()) return entry.getKey();
            }
            return ' ';
        }
        //String.valueOf('c')：字符串中字符c出现的第一个位置，没出现返回-1
        //String.lastValueOf('c'):字符串中字符c出现的最后一个位置
        //A-Z 65-90
        public char algorithm2(String s){
            int res = Integer.MAX_VALUE;
            for (char i = 'a'; i <= 'z'; i++){
                int temp = s.indexOf(i);
                if (temp != -1 && temp == s.lastIndexOf(i)) res = Math.min(res, temp);
            }
            if (res == Integer.MAX_VALUE) return ' ';
            else return s.charAt(res);
        }

    }

}
