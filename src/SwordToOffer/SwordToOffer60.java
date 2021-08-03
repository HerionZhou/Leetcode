package SwordToOffer;

import java.util.Arrays;

public class SwordToOffer60 {
    static class Solution{
        //n个骰子，每种情况的概率
        //f(n,x)表示n个骰子点数为x的概率
        //f(n,x) = f(n-1,x-1)*1/6 + ... + f(n-1,x-6)*1/6
        //f(n-1,x)与f(n,x+1)，...，f(n,x+6)有关系
        //遍历f(n-1)中各点数概率，将其乘1/6加至f(n)中相关项，完成递推
        public double[] algorithm(int n){
            double[] dp = new double[6];
            Arrays.fill(dp, 1.0 / 6.0);
            for (int i = 2; i <= n; i++){
                double[] temp = new double[5 * i + 1];
                for (int x = 0; x < dp.length; x++){
                    for (int y = 0; y < 6; y++){
                        temp[x + y] += dp[y] / 6.0;
                    }
                }
                dp = temp;
            }
            return dp;
        }

    }
}
