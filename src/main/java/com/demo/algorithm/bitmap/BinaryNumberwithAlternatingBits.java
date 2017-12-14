package com.demo.algorithm.bitmap;

/**
 * Given a positive integer, check whether it has
 *  alternating bits: namely,
 *  if two adjacent bits will always have different values.
 * @author peichunle
 * 思路 判断是否跟前一个数余2相等，相等false，不相等继续除2循环
 */
public class BinaryNumberwithAlternatingBits {
	public static boolean hasAlternatingBits(int n) {
		if(n<=0){
			return false;
		}
		if(n==1){
			return true;
		}
		int tmp = n % 2;
        n = n / 2;
        while(n != 0) {
            if(n % 2 == tmp) {
                return false;
            }
            tmp = n % 2;
            n /= 2;
        }
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(10));
	}
}
