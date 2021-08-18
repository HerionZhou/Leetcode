package Algorithm.SwordToOffer;

public class SwordToOffer03 {
    // 原地交换思想，将索引与值对应后，数组值和作为索引指向的值相同则输出
    public static int algorithm(int[] nums){
        int i = 0;
        while (i < nums.length){
            // 索引与值相同
            if (nums[i] == i){
                i++;
                continue;
            }
            // 数组值和作为索引指向的值相同则输出
            if (nums[i] == nums[nums[i]]) return nums[i];
            // 数组值和作为索引指向的值交换，交换后被交换的值与索引相同
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }

    public static void main(String[] args){
        //int[] test = new int[10];
        int[] test = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(algorithm(test));
    }
}
