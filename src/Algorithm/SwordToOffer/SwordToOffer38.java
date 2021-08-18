package Algorithm.SwordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwordToOffer38 {
    static class Solution{
        StringBuilder item = new StringBuilder();
        List<String> res = new ArrayList<>();
        public String[] algorithm(String s){
            boolean[] flag = new boolean[s.length()];
            char[] str = s.toCharArray();
            recur(str, flag);
            return (String[]) res.toArray(new String[res.size()]);
        }

        public void recur(char[] str, boolean[] flag){
            if (item.length() == str.length){
                res.add(item.toString());
                return;
            }
            for (int i = 0; i < flag.length; i++){
                if (!flag[i]){
                    item.append(str[i]);
                    flag[i] = true;
                    recur(str, flag);
                    flag[i] = false;
                    item.deleteCharAt(item.length() - 1);
                }
            }

        }

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "abc";
        String[] res = solution.algorithm(s);
        System.out.println(Arrays.toString(res));
    }

}
