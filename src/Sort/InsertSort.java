package Sort;

import java.util.Arrays;

public class InsertSort {
    //插入排序 n^2
    //从第二个数字开始，将这个数字向左移动，插入到前面子数组的合适位置。
    public static void insertSort(int[] nums){
        if (nums.length > 1){
            for (int i = 1; i < nums.length; i++){
                int temp = nums[i];
                int j = i -1;
                while (j >= 0 && nums[j] > temp){
                    nums[j + 1] = nums[j];
                    j--;
                }
                nums[j + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,5,21,76,9,32};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
