package com.demo.algorithm.bitmap;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming
 * weight).
 * 
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function
 * should return 3.
 * 
 * @author peichunle
 * 直接每次左移一位,考虑可能会超过int
 */
public class Numberof1Bits {
	public static int hammingWeight(int n) {
		int NumberOfOne = 0;
		/* 输入是一个无符号的数，故不会出现死循环 */
		while (n != 0) {
			NumberOfOne ++;
		      n &= (n-1);
		}
		return NumberOfOne;
    }
	
	public static void main(String[] args) {
	}
}
