package com.demo.algorithm.array;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] A) {
        int length = A.length;
        int[] result = new int[length];
        int positiveIndex = -1;
        for (int i = 0; i < length; i++) {
            if (A[i] > 0) {
                positiveIndex = i;
                break;
            }
        }
        // 3种情形，没有正数，全部是正数，正数负数交替

        int negtiveIndex = positiveIndex >= 0 ? positiveIndex - 1 : length-1;
        // 双指针，从正数位置向两端扩散
        for (int i = 0; i < length; i++) {
            if (positiveIndex  <0||positiveIndex>length-1) {
                result[i] = A[negtiveIndex] * A[negtiveIndex];
                negtiveIndex--;
                continue;
            }
            if (negtiveIndex < 0) {
                result[i] = A[positiveIndex] * A[positiveIndex];
                positiveIndex++;
                continue;
            }
            if (A[negtiveIndex] + A[positiveIndex] <= 0) {
                result[i] = A[positiveIndex] * A[positiveIndex];
                positiveIndex++;
            } else {
                result[i] = A[negtiveIndex] * A[negtiveIndex];
                negtiveIndex--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1,1};
        int[] ints = sortedSquares(nums);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

}
