package com.demo.algorithm.array;

/**
 * We have two special characters. The first character can be represented by one bit 0. The second character can be
 * represented by two bits (10 or 11).
 * 
 * Now given a string represented by several bits. Return whether the last character must be a one-bit character or not.
 * The given string will always end with a zero.</br>
 * 
 * Example 1: 
 * Input: bits = [1, 0, 0]</br>
 * Output: True </br>
 * Explanation: The only way to decode it is two-bit character and
 * one-bit character. So the last character is one-bit character. </br>
 * Example 2: 
 * Input: bits = [1, 1, 1, 0] </br>
 * Output: False</br>
 * Explanation: The only way to decode it is two-bit character and two-bit character. So the last character is NOT
 * one-bit character.
 * 
 * @author peichunle
 * 思路：遍历
 */
public class BitCharacters {
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		while (i < bits.length) {
			if (i == bits.length - 1) {
				return true;
			}
			if (bits[i] == 1) {
				i++;
			}
			i++;
		}
		return false;
	}
}
