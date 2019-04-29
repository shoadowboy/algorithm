package com.demo.algorithm.array;

import java.util.Arrays;

/**
 * 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择 x = -K 或是 x = K，并将 x 加到 A[i] 中。
 *
 * 在此过程之后，我们得到一些数组 B。
 *
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 */
public class SmallestRangeII {
    public int smallestRangeII(int[] A, int K) {
        if (A==null||A.length<2){
            return 0;
        }
        Arrays.sort(A);
        int len = A.length;
        int res = A[len-1]-A[0];
        for (int i=1;i<len;i++) {
            int min = Math.min(A[0]+K,A[i]-K);
            int max = Math.max(A[len-1]-K,A[i-1]+K);
            res = Math.min(max-min,res);
        }
        return res;
    }
}
