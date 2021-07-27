package Sort;

import java.util.Arrays;

//归并排序 nlogn
public class MergeSort {
    public static void merge(int[] nums, int l, int r){
        if (l >= r) return;
        int m = (l + r) / 2;
        merge(nums, l, m);
        merge(nums, m + 1, r);
        mergeSort(nums, l, r, m);
    }
    public static void mergeSort(int[] nums, int l, int r, int m){
        int i = l;
        int left = l, right = m + 1;
        int[] temp = new int[nums.length];
        while (left <= m && right <= r){
            if (nums[left] < nums[right]) temp[i++] = nums[left++];
            else temp[i++] = nums[right++];
        }
        while (left <= m) temp[i++] = nums[left++];
        while (right <= r) temp[i++] = nums[right++];
        for (int j = 0; j < (r - l + 1); j++){
            nums[l + j] = temp[l + j];
        }
    }

    public static void main(String[] args) {
        int[] test1 = {6,8,1,4,6,10,1};
        merge(test1, 0, test1.length - 1);
        System.out.println(Arrays.toString(test1));
    }
}
