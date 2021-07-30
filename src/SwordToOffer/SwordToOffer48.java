package SwordToOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class SwordToOffer48 {
    static class Solution{
        //滑动窗口
        public int algorithm(String s){
            if (s.length() == 0) return 0;
            if (s.length() == 1) return 1;
            HashSet set = new HashSet();
            int max = 1, len = 1;
            int i = 0, j = 1;
            set.add(s.charAt(0));
            while (i < s.length() && j < s.length()){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    len++;
                    max = Math.max(len, max);
                }else {
                    while (set.contains(s.charAt(j))) {
                        set.remove(s.charAt(i));
                        len--;
                        i++;
                    }
                    set.add(s.charAt(j));
                    len++;
                }
                j++;
            }
            return max;
        }
        //动态规划
        //通过哈希表存下离当前字符最近的字符位置，通过比较相同两个字符的距离和上一个状态子串长度来算出当前子串长度
        //map.getOrDefault(key, default)：获取value，如果没有返回默认值
        public int algorithm1(String s){
            HashMap<Character, Integer> map = new HashMap<>();
            int temp = 0, j = 0, res = 0;
            while (j < s.length()){
                int i = map.getOrDefault(s.charAt(j), -1);
                map.put(s.charAt(j), j);
                if (temp >= j - i) temp = j - i;
                else temp++;
                res = Math.max(res, temp);
                j++;
            }
            return res;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            String s = "pwwkew";
            System.out.println(solution.algorithm1(s));
        }
    }
}
