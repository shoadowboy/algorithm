package com.demo.algorithm.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the first non-repeating character in 
 * it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 * @author peichunle
 *思路：用一个数组存放每个数字出现的次数。a[26]（需要计算字符到a得差值） ，或者是用a[128] ascll码表示
 */
public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
		if(s==null||s.length()==0){
			return -1;
		}
		if(s.length()==1){
			return 0;
		}
		int[] a = new int[128];
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			a[c]++;
		}
		for(int i=0;i<charArray.length;i++){
			if(a[charArray[i]]==1){
				return i;
			}
		}
		return -1;
    }
	
	
	public static void main(String[] args) {
		String s ="tezetcode";
		System.out.println(firstUniqChar(s ));
	}
}
