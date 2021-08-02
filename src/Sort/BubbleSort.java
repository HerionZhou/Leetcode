package Sort;

import java.util.Arrays;

public class BubbleSort {
    //冒泡排序 n^2
    //相邻两个数交换，每轮将最大或最小的一个数移到结果位置
    public static void bubbleSort(int[] nums){
        for (int i = nums.length - 1; i > 0; i--){
            boolean flag = false;
            for (int j = 1; j <= i; j++){
                if (nums[j - 1] > nums[j]){
                    flag= true;
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
            if (!flag) return;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,55,6,7,34,55};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
