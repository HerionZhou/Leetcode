package Algorithm.SwordToOffer;

public class SwordToOffer57_1 {
    static class Solution{
        public int[] algorithm(int[] nums, int target){
            int l = 0, r = nums.length - 1;
            while (l < r){
                if (nums[r] - target == nums[l]) break;
                else if (nums[l] + nums[r] > target) r--;
                else if (nums[l] + nums[r] < target) l++;
            }
            return new int[] {nums[l], nums[r]};
        }

    }

}
