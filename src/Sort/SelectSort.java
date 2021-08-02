package Sort;

import java.util.Arrays;

public class SelectSort {
    //选择排序 n^2
    //每轮选择最小的与当前数交换
    public static void selectSort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int t = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[t] > nums[j]) t = j;
            }
            int temp = nums[t];
            nums[t] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,321,7,5,99,21};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
