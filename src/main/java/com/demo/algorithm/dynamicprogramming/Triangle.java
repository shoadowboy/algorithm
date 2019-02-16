package com.demo.algorithm.dynamicprogramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 三角形最小路径和 尝试o（n）额外空间
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if(n==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int[] road = new int[n];
        road[0] = triangle.get(0).get(0);
        if(n==1){
            return road[0];
        }
        road[1] = road[0]+triangle.get(1).get(1);
        road[0] = road[0]+triangle.get(1).get(0);
        if(n==2){
            return Math.min(road[0],road[1]);
        }
        for(int i = 2;i < n;i++){
            road[i] = road[i-1] + triangle.get(i).get(i);
            for(int j = i-1;j >= 1;j--){
                road[j] = Math.min(road[j],road[j-1])+triangle.get(i).get(j);
            }
            road[0] = road[0]+triangle.get(i).get(0);
        }
        for(int i = 0;i < n;i++){
            if(road[i] < min){
                min = road[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        int i = new Triangle().minimumTotal(triangle);
        System.out.println(i);
    }
}
