package SwordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode51 {
    static class Solution{
        int n;
        List<List<String>> res = new ArrayList<>();
        public List<List<String>> algorithm(int n){
            this.n = n;
            char[][] matrix = new char[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = '.';
                }
            }
            backTract(0, matrix);
            return res;
        }
        public void backTract(int row, char[][] matrix){
            if (row == n){
                List<String> temp = new ArrayList<>();
                for (int i = 0; i < n; i++){
                    StringBuilder str = new StringBuilder();
                    for (int j = 0; j < n; j++){
                        str.append(matrix[i][j]);
                    }
                    temp.add(str.toString());
                }
                res.add(temp);
            }
            for (int column = 0; column < n; column++){
                if (canQ(row, column, matrix)){
                    matrix[row][column] = 'Q';
                    backTract(row + 1, matrix);
                    matrix[row][column] = '.';
                }
            }
        }
        public boolean canQ(int row, int column, char[][] matrix){
            int i = row - 1;
            int j = column - 1;
            while (i >= 0){
                if (matrix[i--][column] == 'Q') return false;
            }
            i = row - 1;
            while (i >= 0 && j >= 0){
                if (matrix[i--][j--] == 'Q') return false;
            }
            i = row - 1;
            j = column + 1;
            while (i >= 0 && j < n){
                if (matrix[i--][j++] == 'Q') return false;
            }
            return true;
        }
    }
}










