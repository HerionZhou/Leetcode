package Algorithm.SwordToOffer;

public class SwordToOffer58_2 {
    static class Solution{
        //遍历
        public String algorithm(String s, int n){
            StringBuilder res = new StringBuilder();
            for (int i = n; i < s.length(); i++){
                res.append(s.charAt(i));
            }
            for (int i = 0; i < n; i++){
                res.append(s.charAt(i));
            }
            return res.toString();
        }
        //切片
        public String algorithm1(String s, int n){
            return s.substring(n, s.length()) + s.substring(0, n);
        }

    }

}
