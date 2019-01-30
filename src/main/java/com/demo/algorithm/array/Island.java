package com.demo.algorithm.array;

public class Island {
    public int maxAreaOfIsland(int[][] grid) {
        int maxSize = 0;
        if(grid==null || grid.length ==0) return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int tempCount=search(grid,i,j);
                    maxSize=Math.max(maxSize,tempCount);
                }
            }
        }
        return  maxSize;
    }

    public int search(int [][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!=1) return 0;
        grid[i][j]=0;
        return 1+search(grid,i,j+1)+search(grid,i,j-1)+search(grid,i-1,j)+search(grid,i+1,j);
    }
}
