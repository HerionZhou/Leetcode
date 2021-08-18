package Algorithm.SwordToOffer;

public class SwordToOffer10 {
    //递归
    public static int algorithm(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return algorithm(n - 1) + algorithm(n - 2);
    }
    //动态规划
    public static int algorithm2(int n){
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(algorithm(5));
    }
}
