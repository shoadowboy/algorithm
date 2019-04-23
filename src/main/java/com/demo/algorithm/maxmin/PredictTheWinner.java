package com.demo.algorithm.maxmin;

/**
 * 给定一个表示分数的非负整数数组。 玩家1从数组任意一端拿取一个分数，随后玩家2继续从剩余数组任意一端拿取分数，然后玩家1拿，……。每次一个玩家只能拿取一个分数，分数被拿取之后不再可取。直到没有剩余分数可取时游戏结束。最终获得分数总和最多的玩家获胜。
 *
 * 给定一个表示分数的数组，预测玩家1是否会成为赢家。你可以假设每个玩家的玩法都会使他的分数最大化。
 */
public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        int n=nums.length;
        int[][] score = new int[n][n];
        for (int i=0;i<n;i++){
            score[i][i] = nums[i];
        }
        for (int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
               score[j][i+j] = Math.max(nums[j]-score[j+1][i+j],nums[i+j]-score[j][i+j-1]);
            }
        }
        return score[0][n-1]>=0;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        boolean b = new PredictTheWinner().PredictTheWinner(nums);
        System.out.println(b);
    }
}
