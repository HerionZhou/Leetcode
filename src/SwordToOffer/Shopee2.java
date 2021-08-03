package SwordToOffer;

public class Shopee2 {
    //将数字n拆成k份
    //动态规划
    public static int algorithm(int n, int k){
        //dp[i][j]表示把i分成j份的分法数
        int[][] dp = new int[201][8];
        //初始状态，把i分成1份，有1种分法
        for (int i = 1; i <= n; i++){
            dp[i][1] = 1;
        }
        for (int i = 2; i <=n; i++){
            for (int j = 2; j <= k; j++){
                if (i < j) dp[i][j] = 0;
                else if (i == j) dp[i][j] = 1;
                else {
                    //把i分成j份，先让每一份有个1，剩下i-j分成1，2，...，j份
                    //dp[i-1][j-1]包含把i-j分成1，2，...，j-1份
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - j][j];
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        System.out.println(algorithm(7, 3));
    }
}
