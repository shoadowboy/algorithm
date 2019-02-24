package com.demo.algorithm.dynamicprogramming;

/**
 * 亚历克斯和李用几堆石子在做游戏。偶数堆（）石子排成一行，每堆都有正整数颗石子 piles[i] 。
 *
 * 游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
 *
 * 亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
 *
 * 假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
 */
public class StoneGame {

    /**
     * 这个是bug 直接判断偶数下标和奇数下标哪个总和多，就可以直接赢了
     * @param piles
     * @return
     */
    public boolean stoneGame1(int[] piles) {
        if (piles.length%2==0){
            return true;
        }
        return false;
    }

    public boolean stoneGame(int[] piles) {
        int length = piles.length;
        // dp[i][j] 为piles[i]~piles[j]Alex最多可以赢Lee的分数
        int[][] dp = new int[length][length];
        // 只有一个堆的情形
        for (int i=0;i<length;i++){
            dp[i][i] = piles[i];
        }
        for(int dis = 1; dis < length; dis++) {
            for(int i = 0; i < length - dis; i++) {
                dp[i][i+dis] = Math.max(piles[i]-dp[i+1][i+dis], piles[i+dis]-dp[i][i+dis-1]);
            }
        }
        return  dp[0][length-1] > 0;
    }


}
