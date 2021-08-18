package Algorithm.SwordToOffer;

public class SwordToOffer44 {
    //找规律
    static class Solution{
        public int algorithm(int n){
            if (n == 1) return 0;
            int count = 1;
            int res = 0;
            while (n > 1){
                int temp = count;
                while (temp % 10 != 0 || temp / 10 != 0){
                    res = temp % 10;
                    temp = temp / 10;
                    n--;
                }
                count++;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm(18));
    }
}
