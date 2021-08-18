package Algorithm.SwordToOffer;

public class LeetCode698 {
    static class Solution {
        boolean flag;
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int sum = 0;
            for (int num :nums){
                sum += num;
            }
            int avg = sum / k;
            if (avg * k != sum) return false;
            int[] resSet = new int[k];
            recur(nums, resSet, 0, avg);
            return flag;
        }

        public void recur(int[] nums, int[]resSet, int i, int avg){
            if (i == nums.length) {
                for (int num : resSet){
                    if (num != avg) return;
                }
                flag = true;
                return;
            }
            for (int j = 0; j < resSet.length; j++){
                if (resSet[j] + nums[i] <= avg){
                    resSet[j] = resSet[j] + nums[i];
                    recur(nums, resSet, i + 1, avg);
                    resSet[j] = resSet[j] - nums[i];
                }
            }
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] test = {18,20,39,73,96,99,101,111,114,190,207,295,471,649,700,1037};
        System.out.println(solution.canPartitionKSubsets(test, 4));
    }
}
