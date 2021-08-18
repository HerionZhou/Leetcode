package Algorithm.DynamicProgramming;

public class LeetCode72 {
    static class Solution{
        //编辑距离
        //dp[i][j]表示 word1的1-i个字符转换为word2的1-j个字符需要的步骤数
        //dp[i-1][j]+1表示 删除word1的第i个字符后与word2的1-j个字符匹配的步骤数
        //dp[i][j-1]+1表示 增加word2的第j个字符后与word1的1-i个字符匹配的步骤数
        //dp[i-1][j-1]+1表示 改变word1第i个字符后与word2的1-j个字符匹配的步骤数
        public int algorithm(String word1, String word2){
            int len1 = word1.length();
            int len2 = word2.length();

            int[][] dp = new int[len1 + 1][len2 + 1];

            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }
            for (int i = 0; i <= len2; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i <= len1; i++){
                for (int j = 1; j <= len2; j++){
                    if (word1.charAt(i - 1) == (word2.charAt(j - 1))){
                        dp[i][j] = dp[i - 1][j - 1];
                    }else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    }
                }
            }
            return dp[len1][len2];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm("horse", "ros"));
    }
}
