package com.demo.algorithm.array;

/**
 * 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择任意 x 满足 -K <= x <= K，并将 x 加到 A[i] 中。
 *
 * 在此过程之后，我们得到一些数组 B。
 *
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 */
public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        if (A == null || A.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<A.length;i++){
            if (A[i]>max){
                max = A[i];
            }
            if (A[i]<min){
                min = A[i];
            }
        }

        if (max - min > 2 * K) {
            return max - min - 2 * K;
        } else {
            return 0;
        }
    }
}
