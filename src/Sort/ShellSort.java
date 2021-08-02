package Sort;

import java.util.Arrays;

public class ShellSort {
    //希尔排序 <n^2
    //内部是个插入排序，比较距离是gap
    public static void shellSort(int[] nums){
        for (int gap = nums.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < nums.length; i++){
                int j = i;
                while (j - gap >=0 && nums[j] < nums[j - gap]){
                    int temp = nums[j];
                    nums[j] = nums[j - gap];
                    nums[j - gap] = temp;
                    j -= gap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,4,1,5,7,8,3,2,7,0};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
