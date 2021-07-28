package SwordToOffer;

public class SwordToOffer53_1 {
    static class Solution{
        public int algorithm(int[] nums, int target){
            int count = 0;
            for (int num :nums){
                if (num == target) count++;
            }
            return count;
        }
        //二分查找
        public int algorithm1(int[] nums, int target){
            int count = 0;
            int l = 0, r = nums.length - 1, m = (l + r) / 2;
            while (l <= r && nums[m] != target){
                if (l <= r && nums[m] < target){
                    l = m + 1;
                    m = (l + r) / 2;
                }else if (l <= r && nums[m] > target){
                    r = m - 1;
                    m = (l + r) / 2;
                }
            }
            int temp = m;
            while (temp <= nums.length - 1 && nums[temp] == target){
                count++;
                temp++;
            }
            temp = m;
            while (temp - 1 >= 0 && nums[temp - 1] == target){
                count++;
                temp--;
            }
            return count;
        }

    }

}
