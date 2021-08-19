package Algorithm.Patition;

public class LeetCode240 {
    static class Solution{
        public boolean algorithm(int[][] matrix, int target){
            if (matrix.length == 0) return false;
            int one = matrix.length;
            int two = matrix[0].length;
            int i = one - 1, j = 0;
            while (i >= 0 && j < two){
                if (matrix[i][j] > target) i--;
                else if (matrix[i][j] < target) j++;
                else return true;
            }
            return false;
        }

    }

}
