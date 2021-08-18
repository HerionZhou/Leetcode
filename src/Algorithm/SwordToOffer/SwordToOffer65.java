package Algorithm.SwordToOffer;

public class SwordToOffer65 {

    static class Solution{
        //将a + b转换成 不增 + 增
        public int algorithm(int a, int b){
            //如果不发生进位，则a ^ b就是结果
            while (b != 0){
                int c = (a & b) << 1; //c是进位的结果
                a = a ^ b; //a是不进位的结果
                b = c; //b = c是进位的结果
            }
            return a;
        }

        public int algorithm1(int a, int b){
            if (b == 0) return a;
            return algorithm1(a ^ b, (a & b) << 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.algorithm1(3, 9));
    }

}
