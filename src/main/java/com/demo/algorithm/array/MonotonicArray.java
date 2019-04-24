package com.demo.algorithm.array;

/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * <p>
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * <p>
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 */
public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        if (A == null || A.length <= 2) {
            return true;
        }
        boolean isBegin = A[0] != A[1];
        boolean isUp = false;
        if (isBegin) {
            isUp = A[1] - A[0] > 0;
        }
        for (int i = 1; i < A.length; i++) {
            if (!isBegin) {
                if (A[i - 1] != A[i]) {
                    isBegin = true;
                    isUp = A[i] - A[i - 1] > 0;
                }
            } else {
                if (isUp && A[i] - A[i - 1] < 0) {
                    return false;
                } else if (!isUp && A[i] - A[i - 1] > 0) {
                    return false;
                }       //判断是增加还是减少
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {3,4,1};
        boolean monotonic = new MonotonicArray().isMonotonic(A);
        System.out.println(monotonic);
    }
}
