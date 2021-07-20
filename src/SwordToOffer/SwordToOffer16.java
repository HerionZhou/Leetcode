package SwordToOffer;

public class SwordToOffer16 {
    //位运算
    public static double algorithm(double x, int n){
        if (x == 0 ) return 0;
        long b = n;
        if (b < 0){
            x = 1 / x;
            b = -b;
        }
        double res = 1;
        while (b > 0){
            if ((b & 1) == 1){
                res = res * x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(algorithm(2, 10));
    }
}
