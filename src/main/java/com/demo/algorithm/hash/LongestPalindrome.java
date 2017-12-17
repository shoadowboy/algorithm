package com.demo.algorithm.hash;

import java.util.HashMap;
import java.util.Set;

/**
 * Given a string which consists of lowercase or uppercase letters, 
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * Example:
 * Input:
 * "abccccdd"
 * Output:
 * 7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * @author peichunle
 * 思路：存hash，然后遍历每个字符出现的次数为偶数的加上，并且判断下有无出现次数为奇数的，有最长长度加1，没有就是所有偶数次数之和
 */
public class LongestPalindrome {
	public static int longestPalindrome(String s) {
		int result = 0;
		if (s == null || s.length() == 0) {
			return 0;
		}
		HashMap<Character, Integer> dist = new HashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			dist.put(c, dist.getOrDefault(c, 0) + 1);
		}
		boolean checkExistSingle = false;
		Set<Character> keySet = dist.keySet();
		//
		Integer num = null;
		for (Character character : keySet) {
			num = dist.get(character);
			if (num > 1) {
				if (num % 2 == 0) {
					result += num;
				} else {
					result += num - 1;
					if (!checkExistSingle) {
						result += 1;
						checkExistSingle = true;
					}
				}
			} else if (!checkExistSingle) {
				result += 1;
				checkExistSingle = true;
			}
		}
		return result;
	}
	//可以用数组保存，这样只需要遍历一次，
//	public int longestPalindrome(String s) {
//		int[] map = new int[128];
//		int res = 0;
//		for (char c : s.toCharArray()) {
//			if ((int) map[c]++ % 2 == 1)
//				res += 2;
//		}
//		return s.length() > res ? 1 + res : res;
//	}
	public static void main(String[] args) {
		int longestPalindrome = longestPalindrome("aca");
		System.out.println(longestPalindrome);
	}
}
