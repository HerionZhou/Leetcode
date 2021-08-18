package Algorithm.SwordToOffer;

public class SwordToOffer49 {
    static class Solution{
        //动态规划
        //使用三个位置标签来标记2、3、5应该计算的位置（使用过就加1）
        public int algorithm(int n){
            if (n == 1) return 1;
            int a = 0, b = 0, c = 0;
            int[] dp = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; i++){
                int temp2 = dp[a] * 2, temp3 = dp[b] * 3, temp5 = dp[c] * 5;
                dp[i] = Math.min(temp2, Math.min(temp3, temp5));
                if (dp[i] == temp2) a++;
                if (dp[i] == temp3) b++;
                if (dp[i] == temp5) c++;
            }
            return dp[n - 1];
        }

    }
}
