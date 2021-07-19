package SwordToOffer;

public class SwordToOffer13 {

    public static int count = 0;
    public static int algorithm(int m, int n, int k){
        int[][] flag = new int[m][n];
        recur(0, 0, m, n, k, flag);
        return count;
    }

    public static void recur(int i, int j, int m, int n, int k, int[][] flag){
        if ((sums(i) + sums(j)) > k || flag[i][j] == 1) return;
        count++;
        flag[i][j] = 1;
        if (i < m - 1) recur(i + 1, j, m, n, k, flag);
        if (j < n - 1) recur(i, j + 1, m, n, k, flag);
    }

    public static int sums(int x){
        int s = 0;
        while(x != 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(algorithm(3, 2, 17));
    }

}
