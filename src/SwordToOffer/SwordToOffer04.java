package SwordToOffer;

public class SwordToOffer04 {
    public static boolean algorithm(int[][] matrix, int target){
        // 矩阵以右上角为根节点，近似一棵二叉搜索树
        if (matrix.length == 0){
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while (j >= 0 && i < matrix.length){
            if (target == matrix[i][j]){
                return true;
            }else if (target > matrix[i][j]){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 1}};
        int target = 5;
        System.out.println(algorithm(matrix, target));
    }
}
