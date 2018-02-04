package com.demo.algorithm.math;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * @author peichunle
 * 位运算，2的n次方只有第一位为1 其余全是0，
 */
public class PowerofTwo {
	public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n - 1)) == 0 ); 
   }
}
