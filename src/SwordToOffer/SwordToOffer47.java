package SwordToOffer;

public class SwordToOffer47 {
    //动态规划，不需要递归！
    static class Solution{
        public int algorithm(int[][] grid){
            for (int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[0].length; j++){
                    if (i == 0 && j == 0) continue;
                    if (i == 0) grid[i][j] += grid[i][j - 1];
                    else if (j == 0) grid[i][j] += grid[i - 1][j];
                    else grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
                }
            }
            return grid[grid.length - 1][grid[0].length - 1];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution.algorithm(grid));
    }
}
