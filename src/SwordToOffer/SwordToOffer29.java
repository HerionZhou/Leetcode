package SwordToOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class SwordToOffer29 {
    public static int[] algorithm(int[][] matrix){
        int[] res = new int[matrix.length * matrix[0].length];
        int idx = 0;
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        while (true){
            for (int i = left; i <= right; i++){
                res[idx] = matrix[top][i];
                idx++;
            }
            top++;
            if (top > bottom) break;
            for (int i = top; i <= bottom; i++){
                res[idx] = matrix[i][right];
                idx++;
            }
            right--;
            if (left > right) break;
            for (int i = right; i >= left; i--){
                res[idx] = matrix[bottom][i];
                idx++;
            }
            bottom--;
            if (top > bottom) break;
            for (int i = bottom; i >= top; i--){
                res[idx] = matrix[i][left];
                idx++;
            }
            left++;
            if (left > right) break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(algorithm(matrix)));
    }
}