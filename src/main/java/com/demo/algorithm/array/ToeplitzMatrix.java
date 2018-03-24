package com.demo.algorithm.array;

/**
 * 直接判断每个元素和下一个对角线是否相同。不等直接返会false
 */
public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] nums = {{2, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean result = isToeplitzMatrix(nums);
        System.out.println(result);
    }
}
