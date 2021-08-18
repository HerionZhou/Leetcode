package Algorithm.DynamicProgramming;

public class LeetCode300 {
    static class Solution{
        //最长递增子序列
        public int algorithm(int[] nums){
            int[] dp = new int[nums.length];
            dp[0] = 1;
            for (int i = 1; i < dp.length; i++){
                int max = 0;
                for (int j = 0; j < i; j++){
                    if (nums[i] > nums[j] && max < dp[j]){
                        max = dp[j];
                    }
                }
                if (max == 0) dp[i] = 1;
                else dp[i] = max + 1;
            }
            int res = 0;
            for (int i = 0; i < dp.length; i++){
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(solution.algorithm(nums));
    }
}
