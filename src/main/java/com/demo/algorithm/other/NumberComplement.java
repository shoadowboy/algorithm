package com.demo.algorithm.other;

/**
 * 
 * Given a positive integer, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.
 * Example：
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 * 思路：所有位数为1-原数就是
 * 
 * @author peichunle
 *
 */
public class NumberComplement {
	 public static int findComplement(int num) {
		 int result =0;
		 int digit = 0;
		 int orign = num;
		 while(num!=0){
			 
			 result += 1<<digit;
			 digit++;
			 num = num>>1;
		 }
		 
		 return result-orign;
	 }
	 
	 public static void main(String[] args) {
		int findComplement = findComplement(5);
		System.out.println(findComplement);
	}
}
