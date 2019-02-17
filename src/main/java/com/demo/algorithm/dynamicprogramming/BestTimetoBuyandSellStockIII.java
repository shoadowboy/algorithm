package com.demo.algorithm.dynamicprogramming;

/**
 * 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
 * <p>
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {

        // 为在到达第i天时最多可进行j次交易的最大利润
        int[] profit = new int[3];
        profit[0] = 0;
        // 为在到达第i天时最多可进行j次交易并且最后一次交易在当前这个最后一天卖出的最大利润
        int[] localMaxProfit = new int[3];
        localMaxProfit[0] = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            for (int j = profit.length - 1; j >= 1; j--) {
                localMaxProfit[j] = Math.max(profit[j - 1] + Math.max(diff, 0), localMaxProfit[j] + diff);
                profit[j] = Math.max(localMaxProfit[j], profit[j]);
            }
        }
        return profit[2];
    }

    public static void main(String[] args) {
        int[] prices ={1,2,3,4,5};
        int i = new BestTimetoBuyandSellStockIII().maxProfit(prices);
        System.out.println(i);
    }
}
