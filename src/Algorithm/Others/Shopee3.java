package Algorithm.Others;

public class Shopee3 {
    //给一个数组，找到中间元素，即左边和=右边和=本身
    public static int algorithm(int[] nums){
        int sum = 0;
        for (int num: nums) sum += num;
        int left = 0, right = sum - nums[0];
        for (int i = 1; i < nums.length; i++){
            left += nums[i - 1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,7,4,3,2,1};
        System.out.println(algorithm(nums));
    }
}
