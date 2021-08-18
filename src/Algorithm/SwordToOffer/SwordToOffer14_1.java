package Algorithm.SwordToOffer;

public class SwordToOffer14_1 {
    public static int algorithm(int n){
        int res = 1;
        if (n == 2) return 1;
        if (n == 3) return 2;
        while (n > 0){
            if (n - 3 >= 3){
                res *= 3;
                n -= 3;
            }else if (n - 2 >= 2){
                res *= 2;
                n -= 2;
            }else {
                res *= n;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(algorithm(6));
    }
}
