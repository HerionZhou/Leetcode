package Algorithm.DynamicProgramming;

public class LeetCode746 {
    static class Solution{
        //最小花费爬楼梯
        //动态规划
        public int algorithm(int[] cost){
            if (cost.length == 1) return cost[0];
            int[] dp = new int[cost.length + 1];
            dp[0] = 0;
            dp[1] = 0;
            for (int i = 2; i <= cost.length; i++) {
                if (dp[i - 1] + cost[i - 1] > dp[i - 2] + cost[i - 2]){
                    dp[i] = dp[i - 2] + cost[i - 2];
                } else {
                    dp[i] = dp[i - 1] + cost[i - 1];
                }
            }
            return dp[cost.length];
        }

    }
}
