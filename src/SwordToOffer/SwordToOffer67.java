package SwordToOffer;

public class SwordToOffer67 {
    static class Solution{
        public int algorithm(String str){
            str = str.trim();
            if (str.length() == 0) return 0;
            StringBuilder res = new StringBuilder();
            int idx = 0;
            if (str.charAt(idx) == '-' || str.charAt(idx) == '+'){
                res.append(str.charAt(idx));
                idx++;
            }
            boolean flag = false;
            while (idx < str.length()){
                if (str.charAt(idx) >= '0' && str.charAt(idx) <= '9'){
                    res.append(str.charAt(idx));
                    if (Long.parseLong(res.toString()) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                    else if (Long.parseLong(res.toString()) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                    flag = true;
                    idx++;
                } else {
                    break;
                }
            }
            if (flag) {
                return Integer.parseInt(res.toString());
            }
            return 0;
        }

        public int algorithm1(String str){
            str = str.trim();
            if (str.length() == 0) return 0;
            int idx = 0, sign = 1;
            if (str.charAt(idx) == '-'){
                sign = -1;
                idx++;
            }else if (str.charAt(idx) == '+'){
                idx++;
            }
            int res = 0, max = Integer.MAX_VALUE / 10;
            while (idx < str.length()){
                if (str.charAt(idx) < '0' || str.charAt(idx) > '9') break;
                if (res > max || res == max && str.charAt(idx) > '7'){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + (str.charAt(idx) - '0');
                idx++;
            }
            return sign * res;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm1("4193 with words"));
    }
}
