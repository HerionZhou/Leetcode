package Algorithm.FxxkingAlgorithm;

public class LeetCode5 {
    static class Solution{
        //最长回文子串
        public String algorithm(String s){
            if (s.length() < 2) return s;
            String res = "";
            for (int i = 0; i < s.length() - 1; i++){
                //以一个字符为中心
                String s1 = palindrome(s, i, i);
                //以两个字符为中心
                String s2 = palindrome(s, i, i + 1);
                res = s1.length() > res.length() ? s1 : res;
                res = s2.length() > res.length() ? s2 : res;
            }
            return res;
        }

        public String palindrome(String s, int left, int right){
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            //跳出循环时索引left和right的字符不相同
            return s.substring(left + 1, right);
        }

    }

}
