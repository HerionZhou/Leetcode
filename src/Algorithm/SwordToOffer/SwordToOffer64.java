package Algorithm.SwordToOffer;

public class SwordToOffer64 {
    //逻辑运算符的短路
    //用短路效应作为递归出口
    static class Solution{
        public int algorithm(int n){
            boolean x = n > 1 && (n += algorithm(n - 1)) > 0;
            return n;
        }

    }
}
