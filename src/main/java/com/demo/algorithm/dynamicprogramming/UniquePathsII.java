package com.demo.algorithm.dynamicprogramming;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 */
public class UniquePathsII {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int mlen = obstacleGrid.length;
        int nlen = obstacleGrid[0].length;
        for (int i=0;i<mlen;i++){
            for (int j=0;j<nlen;j++){
                if (obstacleGrid[i][j]==1){
                    obstacleGrid [i][j]= 0;
                }else {
                    obstacleGrid [i][j] = 1;
                }
            }
        }

        for (int i=0;i<mlen;i++){
            for (int j=0;j<nlen;j++){
                if (obstacleGrid[i][j]!=0){
                    // 判断上方节点和左侧节点是否为0
                    if (i==0&&j==0){
                        continue;
                    }else if (i==0){
                        obstacleGrid[i][j] = obstacleGrid[i][j-1];
                    }else if (j==0){
                        obstacleGrid[i][j] = obstacleGrid[i-1][j];
                    }else {
                        obstacleGrid [i][j] = obstacleGrid[i][j-1]+obstacleGrid[i-1][j];
                    }
                }
            }
        }

        return obstacleGrid[mlen-1][nlen-1];

    }
}
