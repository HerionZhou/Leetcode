package Algorithm.SwordToOffer;

public class SwordToOffer21 {

    public static int[] algorithm(int[] nums){
        int i = 0, j = nums.length - 1, temp;
        while (i < j){
            if (nums[i] % 2 == 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }else if (nums[j] % 2 == 1){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }else {
                i++;
                j--;
            }

        }
        return nums;
    }
}