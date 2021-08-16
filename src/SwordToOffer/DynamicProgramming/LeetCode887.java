package SwordToOffer.DynamicProgramming;

import java.util.Arrays;

public class LeetCode887 {
    static class Solution{
        //扔鸡蛋问题
        int[][] memo;
        public int algorithm(int k, int n){
            memo = new int[k + 1][n + 1];
            for (int[] item: memo){
                Arrays.fill(item, -1);
            }
            return recur(k, n);
        }
        public int recur(int k, int n){
            if (k == 1) return n;
            if (n == 0) return 0;
            if (memo[k][n] != -1) return memo[k][n];
            int res = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++){
                res = Math.min(res, Math.max(recur(k, n - i), recur(k - 1, i - 1)) + 1);
            }
            memo[k][n] = res;
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm(2, 100));
    }

}
