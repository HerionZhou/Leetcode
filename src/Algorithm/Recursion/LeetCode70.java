package Algorithm.Recursion;

public class LeetCode70 {
    static class Solution{
        public int algorithm(int n){
            if (n < 2) return n;
            return recur(n - 1) + recur(n - 2);
        }

        public int recur(int n){
            if (n == 1 || n == 0) return 1;
            return recur(n - 1) + recur(n - 2);
        }

        //爬楼梯，动态规划
        public int algorithm1(int n){
            if (n < 2) return n;
            int[] res = new int[n + 1];
            res[0] = 1;
            res[1] = 1;
            for (int i = 2; i <= n; i++){
                res[i] = res[i - 1] + res[i - 2];
            }
            return res[n];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm(45));
    }
}
