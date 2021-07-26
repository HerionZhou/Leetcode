package SwordToOffer;

import java.util.Scanner;

public class SwordToOffer43 {
    static class Solution{
        public int algorithm(int n){
            int res = 0;
            for (int i = 1; i <= n; i++){
                int x = i;
                while (x > 0){
                    if (x % 10 == 1) res++;
                    x /= 10;
                }
            }
            return res;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm(2230));
    }

}
