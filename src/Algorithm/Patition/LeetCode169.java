package Algorithm.Patition;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    static class Solution{
        //求数组中数量大于一半的树
        public int algorithm(int[] nums){
            int quantity = nums.length / 2;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                if (!map.containsKey(num)){
                    map.put(num, 1);
                } else {
                    int value = map.get(num);
                    map.put(num, value + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() > quantity){
                    return entry.getKey();
                }
            }
            return -1;
        }

        //摩尔投票法
        //遇到不同的数字相互抵消，最后剩下的一定是出现次数多的数
        public int algorithm1(int[] nums){
            int res = nums[0], count = 1;
            for (int i = 1; i < nums.length; i++){
                if (res == nums[i]) count++;
                else {
                    count--;
                    if (count == 0){
                        res = nums[i];
                        count = 1;
                    }
                }
            }
            return res;
        }

    }

}
