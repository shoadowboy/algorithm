package com.demo.algorithm.hash;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? 
 * How would you adapt your solution to such case? a【128】
 * @author peichunle
 *思路：1 判断s中每个字母个数是否跟t中相同，用数组保存a【128】 如果保证只有26个字符a的长度可以减少为26,
 *    2 把第一个字符串全部相加，然后减去第二个字符串的每个字符，如果最终为0说明两个字符串相等
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s==null&&t==null){
			return true;
		}else if(s!=null&&t!=null){
			//
			if(s.length()!=t.length()){
				return false;
			}
			
			int[] a = new int[128];
			char[] charArray = s.toCharArray();
			for (char c : charArray) {
				a[c]++;
			}
			char[] charArray2 = t.toCharArray();
			for (char c : charArray2) {
				a[c]--;
			}
			for(int i=0;i<a.length;i++){
				if(a[i]!=0){
					return false;
				}
			}
		}else{
			return false;
		}
		return true;
    }
}
