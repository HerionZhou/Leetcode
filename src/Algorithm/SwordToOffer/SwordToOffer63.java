package Algorithm.SwordToOffer;

public class SwordToOffer63 {
    static class Solution{
        //股票最大利润
        //状态：第i天交易的最大利润
        //第i天交易的最大利润：前面交易最大利润 和 当天卖出最大利润（当前价格-之前最小价格） 的 最大值
        public int algorithm(int[] prices){
            int cost = Integer.MAX_VALUE;
            int res = 0;
            for (int price : prices){
                cost = Math.min(cost, price);
                res = Math.max(res, price - cost);
            }
            return res;
        }

    }

}
