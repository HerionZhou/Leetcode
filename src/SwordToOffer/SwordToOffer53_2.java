package SwordToOffer;

public class SwordToOffer53_2 {
    static class Solution{
        public int algorithm(int[] nums){
            int l = 0, r = nums.length - 1;
            while (l <= r){
                int m = (l + r) / 2;
                if (nums[m] == m) l = m + 1;
                else r = m - 1;
            }
            return l;
        }
    }
}
