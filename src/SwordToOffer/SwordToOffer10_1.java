package SwordToOffer;

public class SwordToOffer10_1 {
    public static int algorithm(int n){
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}