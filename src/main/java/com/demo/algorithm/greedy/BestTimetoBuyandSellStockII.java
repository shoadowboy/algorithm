package com.demo.algorithm.greedy;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if (null==prices){
            return 0;
        }
        int length = prices.length;
        if (length < 2) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < length-1; i++) {
            if (prices[i+1]>prices[i]){
                maxProfit+=prices[i+1]-prices[i];
            }
        }
        return maxProfit;
    }
}
