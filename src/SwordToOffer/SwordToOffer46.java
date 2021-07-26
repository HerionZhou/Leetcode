package SwordToOffer;

import java.util.LinkedList;

public class SwordToOffer46 {
    static class Solution{
        //递归
        public int algorithm(int num){
            LinkedList<Integer> stack = new LinkedList<>();
            while (num != 0){
                stack.addFirst(num % 10);
                num /= 10;
            }
            int[] nums = new int[stack.size()];
            int i = 0;
            while (!stack.isEmpty()){
                nums[i++] = stack.removeFirst();
            }
            return recur(nums, 0);
        }

        public int recur(int[] nums ,int idx){
            if (idx >= nums.length - 1) return 1;
            if (nums[idx] ==1 || (nums[idx]==2 && nums[idx + 1] <6)){
                return recur(nums, idx + 1) + recur(nums, idx + 2);
            }else {
                return recur(nums, idx + 1);
            }
        }

        //动态规划
        public int algorithm1(int num){
            String s = String.valueOf(num);
            int[] res = new int[s.length() + 1];
            res[0] = 1;
            res[1] = 1;
            for (int i = 2; i <= s.length(); i++){
                String temp = s.substring(i - 2, i);
                if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0){
                    res[i] = res[i - 1] + res[i - 2];
                }else {
                    res[i] = res[i - 1];
                }
            }
            return res[s.length()];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm(25));
    }
}
