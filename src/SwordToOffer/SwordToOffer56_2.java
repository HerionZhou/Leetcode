package SwordToOffer;

public class SwordToOffer56_2 {
    static class Solution{
        public int algorithm(int[] nums){
            int[] counts = new int[32];
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < 32; j++){
                    counts[j] += nums[i] & 1;
                    nums[i] >>= 1;
                }
            }
            int res = 0, m = 3;
            for (int i = 0; i < 32; i++){
                res <<= 1;
                res = (counts[31 - i] % m) | res;
            }
            return res;
        }
    }
    public static void main(String[] args){
        int i = -12;
        System.out.println(i >>> 1);
    }
}
