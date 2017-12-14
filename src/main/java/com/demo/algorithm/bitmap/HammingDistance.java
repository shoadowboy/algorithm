package com.demo.algorithm.bitmap;

/**
 * The Hamming distance between two integers is the number of positions at 
 * which the corresponding bits are different.
 * @author peichunle
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
 */
public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
	
		int num = x^y;
		int result = 0;
        for(int i = 0; i < 32&&num!=0; i++) {
        	result += num & 1;
            num = num >> 1;
        }
		return  result;
    }
}
