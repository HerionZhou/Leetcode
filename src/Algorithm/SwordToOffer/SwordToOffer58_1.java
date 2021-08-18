package Algorithm.SwordToOffer;

public class SwordToOffer58_1 {
    //字符串比较用equals()方法，不能用==
    static class Solution{
        public String algorithm(String s){
            s = s.trim();
            String[] str = s.split(" ");
            StringBuilder res = new StringBuilder();
            for (int i = str.length - 1; i >= 0; i--){
                res.append(str[i]);
                if (str[i].equals("") || i == 0) continue;
                res.append(" ");
            }
            return res.toString();
        }

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "a good   example";
        System.out.println(solution.algorithm(s));
    }

}
