package SwordToOffer;

public class LeetCode322 {
    static class Solution{
        public int algorithm(int[] coins, int amount){
            if (amount == 0) return 0;
            int[] res = new int[amount + 1];
            for (int i = 1; i < res.length; i++){
                res[i] = amount + 1;
            }
            res[0] = 0;
            for (int i = 1; i < res.length; i++){
                for (int coin : coins){
                    if (i - coin < 0) continue;
                    res[i] = Math.min(res[i], res[i - coin] + 1);
                }
            }
            return res[amount] > amount ? -1 : res[amount];
        }

    }

}
