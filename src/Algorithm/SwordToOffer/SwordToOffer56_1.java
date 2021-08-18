package Algorithm.SwordToOffer;

import java.util.Arrays;

public class SwordToOffer56_1 {
    static class Solution{
        //异或运算^：a ^ a = 0   a ^ 0 = a   a ^ b ^ b = a ^ 0 = a
        //主要性质：一个数与自己异或等于0，一个数与0异或等于自己

        //写在前面，不用第三个变量交换两个变量
        //nums长度为2
        public int[] exchange(int[] nums){
            nums[0] = nums[0] ^ nums[1];
            nums[1] = nums[0] ^ nums[1];
            nums[0] = nums[0] ^ nums[1];
            return nums;
        }

        public int[] algorithm(int[] nums){
            int t = 0;
            //结果t = x ^ y   x，y为结果
            for (int num : nums){
                t = t ^ num;
            }
            int m = 1;
            //找到两数不同的第一个位置
            //t二进制中的1是x，y不同的位
            while ((t & m) == 0){
                m <<= 1;
            }
            int x = 0, y = 0;
            for (int num : nums){
                //相同的两个数在一边
                //因为m是两数不同的第一个位置，所以与m做与运算，一定分在两边
                if ((num & m) == 0) x = x ^ num;
                else y = y ^ num;
            }
            return new int[] {x, y};
        }

    }

    public static void main(String[] args){
        int[] nums = {2, 4, 4, 2, 8, 9};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.algorithm(nums)));
    }

}
