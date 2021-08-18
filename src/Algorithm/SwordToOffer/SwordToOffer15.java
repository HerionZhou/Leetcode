package Algorithm.SwordToOffer;

public class SwordToOffer15 {
    //位运算
    //n & 1:判断n的二进制最后一位是否为1
    //>>:n的二进制右移一位；>>>:n的二进制无符号右移一位
    public static int algorithm(int n){
        int res = 0;
        while (n > 0){
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
    //n & (n - 1 ):将最后一位1变为0
    public static int algorithm1(int n){
        int res = 0;
        while (n > 0){
            res += 1;
            n &= n - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(algorithm(128));
    }
}
