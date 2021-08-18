package Algorithm.SwordToOffer;

public class SwordToOffer12 {

    public static int idx = 0;
    public static boolean algorithm(char[][] board, String word){
        int x = board.length;
        int y = board[0].length;
        int[][] flag = new int[x][y];
        char[] wordArray = word.toCharArray();
        recur(0, 0, board, flag, wordArray);
        if (idx == word.length())
            return true;
        return false;
    }

    public static void recur(int i, int j, char[][] board, int[][] flag, char[] wordArray){
        if (idx == wordArray.length || board[i][j] != wordArray[idx]) return;
        idx++;
        flag[i][j] = 1;
        if (i < board.length -1){
            if (flag[i + 1][j] == 0) recur(i + 1, j, board, flag, wordArray);
        }
        if (j < board[0].length -1){
            if (flag[i][j + 1] == 0) recur(i, j + 1, board, flag, wordArray);
        }
        if (i > 0){
            if (flag[i - 1][j] == 0) recur(i - 1, j, board, flag, wordArray);
        }
        if (j > 0){
            if (flag[i][j - 1] == 0) recur(i, j - 1, board, flag, wordArray);
        }
        //需要置0
        flag[i][j] = 0;
    }

    public static void main(String[] args) {
        char[][] board = {{'A'}};
        String word = "A";
        System.out.println(algorithm(board, word));
    }
}
