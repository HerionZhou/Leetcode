package Algorithm.FxxkingAlgorithm;

import java.util.Arrays;

public class LeetCode204 {
    static class Solution{
        //计算小于n的质数的数量
        public int algorithm(int n){
            boolean[] res = new boolean[n];
            Arrays.fill(res, true);
            for (int i = 2; i * i < n; i++){
                if (res[i]){
                    for (int j = i * i; j < n; j += i){
                        res[j] = false;
                    }
                }
            }
            int count = 0;
            for (int i = 2; i < res.length; i++) {
                if (res[i]) count++;
            }
            return count;
        }

    }

}
