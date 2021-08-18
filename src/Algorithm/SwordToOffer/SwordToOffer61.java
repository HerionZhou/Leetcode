package Algorithm.SwordToOffer;

import java.util.Arrays;
import java.util.HashSet;

public class SwordToOffer61 {
    static class Solution{
        //除了0没有重复数字，并且最大减最小（除0）小于5
        public boolean algorithm(int[] nums){
            Arrays.sort(nums);
            int min = nums[0], max = nums[4];
            for (int i = 0; i < 4; i++){
                if (nums[i] == 0) min = nums[i++];
                else if (nums[i] == nums[i + 1]) return false;
            }
            if (max - min < 5) return true;
            return false;
        }

        public boolean algorithm1(int[] nums){
            HashSet<Integer> set = new HashSet<>();
            int min = 14, max = -1;
            for (int num: nums){
                if (num == 0) continue;
                if (set.contains(num)) return false;
                if (num < min) min = num;
                if (num > max) max = num;
                set.add(num);
            }
            return max - min < 5;
        }
    }
}
