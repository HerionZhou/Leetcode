package Algorithm.FxxkingAlgorithm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    static class Solution{
        //数组中消失的数字
        //将数组中存的数字与索引联系起来
        //把存的数字当做索引，处理索引上的数字
        //遍历一遍后，没有进行处理的数字的索引，就是没出现的数字
        public List<Integer> algorithm(int[] nums){
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] > 0){
                    nums[index] *= -1;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0){
                    res.add(i + 1);
                }
            }
            return res;
        }

    }
}
