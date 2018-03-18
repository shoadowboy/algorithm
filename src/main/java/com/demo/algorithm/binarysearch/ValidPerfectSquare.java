package com.demo.algorithm.binarysearch;

/**
 * 判断一个数是否是完全平方数，不能用sqrt函数，二分查找
 */
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        long left = 0;
        int right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long t = mid * mid;
            if (t == num) return true;
            else if (t < num) left = mid + 1;
            else right =(int) mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147395600));

//        System.out.println(1610546700*1610546700);

    }
}
