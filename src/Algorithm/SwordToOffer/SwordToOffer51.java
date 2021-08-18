package Algorithm.SwordToOffer;

import java.util.Arrays;

public class SwordToOffer51 {
    //归并排序
    static class Solution{
        int res = 0;
        public int algorithm(int[] nums){
            int[] temp = new int[nums.length];
            recur(nums, 0, nums.length - 1, temp);
            System.out.println(Arrays.toString(temp));
            return res;
        }
        public void recur(int[] nums, int l, int r, int[] temp){
            if (l >= r) return;
            int median = (l + r) / 2;
            recur(nums, l, median, temp);
            recur(nums, median + 1, r, temp);

            int i = l;
            int a = l, b = median + 1;
            while (a <= median && b <= r){
                if (nums[a] <= nums[b]){
                    temp[i] = nums[a];
                    i++;
                    a++;
                }else {
                    temp[i] = nums[b];
                    i++;
                    b++;
                    res = res + (median - a + 1);
                }
            }
            while (a <= median){
                temp[i] = nums[a];
                i++;
                a++;
            }
            while (b <= r){
                temp[i] = nums[b];
                i++;
                b++;
            }
            for (int t = 0; t <= (r - l); t++){
                nums[l + t] = temp[l + t];
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3,2,3,1};
        System.out.println(solution.algorithm(nums));
    }
}
