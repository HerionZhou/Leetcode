package Algorithm.SwordToOffer;

public class SwordToOffer42 {
    static class Solution{
        public int algorithm(int[] nums){
            int max = Integer.MIN_VALUE;
            int sum = max;
            for (int num :nums){
                if (sum < 0){
                    sum = 0;
                }
                sum += num;
                if (sum > max) max = sum;
            }
            return max;
        }
        //动态规划
        public int algorithm1(int[] nums){
            int max = nums[0];
            for (int i = 1; i < nums.length; i++){
                if (nums[i - 1] > 0) nums[i] += nums[i - 1];
                if (max < nums[i]) max = nums[i];
            }
            return max;
        }
    }
}
