package SwordToOffer;

public class SwordToOffer19 {
    //动态规划
    public static boolean algorithm(String s, String p){
        int m = s.length() + 1;
        int n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        for (int j = 2; j < n; j += 2){
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (p.charAt(j - 1) == '*'){
                    if (dp[i][j - 2]) dp[i][j] = true;
                    else if (dp[i - 1][j] && s.charAt(i - 1) == p.charAt(j - 2)) dp[i][j] = true;
                    else if (dp[i - 1][j] && p.charAt(j - 2) == '.') dp[i][j] = true;
                }else {
                    if (dp[i - 1][j - 1] && s.charAt(i - 1) == p.charAt(j - 1)) dp[i][j] = true;
                    else if (dp[i - 1][j - 1] && p.charAt(j - 1) == '.') dp[i][j] = true;
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(algorithm("aa", "a*"));
    }

}
