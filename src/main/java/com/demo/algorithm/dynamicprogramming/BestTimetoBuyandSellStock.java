package com.demo.algorithm.dynamicprogramming;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        if (null==prices||prices.length<2){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Integer.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit < 0 ? 0 : maxProfit;
    }
}
