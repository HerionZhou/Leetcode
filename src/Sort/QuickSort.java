package Sort;

import java.util.Arrays;

public class QuickSort {
    //快速排序 nlogn
    //递归，不稳定
    public static void quickSort(int[] nums, int left, int right){
        if (left >= right) return;
        int temp = nums[left];
        int i = left, j = right;
        while (i < j){
            while (i < j && nums[j] >= temp) j--;
            while (i < j && nums[i] <= temp) i++;
            if (i < j){
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
        }
        nums[left] = nums[i];
        nums[i] = temp;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = {30,2,6,8,99,5,12,4,1,3,6,0,32};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
