package com.demo.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a group of two strings, you need to find the longest uncommon subsequence of this group of 
 * two strings. The longest uncommon subsequence is defined as the longest subsequence of one
 *  of these strings and this subsequence should not be any subsequence of the other strings.
 *  
 *  A subsequence is a sequence that can be derived from one sequence by deleting some characters
 *  without changing the order of the remaining elements. Trivially, any string is a subsequence 
 *  of itself and an empty string is a subsequence of any string.
 *  The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.
 * Example
 * Input: "aba", "cdc"
 * Output: 3
 * @author peichunle
 * 思路：判断两个字符串是否相等，不等返回较长的长度
 *
 */
public class LongestUncommonSubsequenceI {
	public static int findLUSlength(String a, String b) {
        
        if(a.equals(b)){
        	return a.length();
        }
        return a.length()>b.length()?a.length():b.length();
//		Map<Character,Integer> mapa = new HashMap<Character,Integer>();
//		Map<Character,Integer> mapb = new HashMap<Character,Integer>();
//		
//		for(int i=0;i<a.length();i++){
//			mapa.put(a.charAt(i), i);
//		}
//		for(int i=0;i<b.length();i++){
//			mapb.put(b.charAt(i), i);
//		}
//		Set<Character> keySet = mapa.keySet();
//		int differentA=0;
//		int differentB=0;
//		for (Character character : keySet) {
//			if(mapb.containsKey(character)){
//				differentA++;
//			}
//		}
//		differentA = a.length()-differentA;
//		Set<Character> keySet2 = mapb.keySet();
//		for (Character character : keySet2) {
//			if(mapa.containsKey(character)){
//				differentB++;
//			}
//		}
//		differentB = b.length()-differentB;
//		return differentA>differentB?differentA:differentB;
    }
	public static void main(String[] args) {
		String b="aba";
		String a ="dbd";
		int findLUSlength = findLUSlength(a , b);
		System.out.println(findLUSlength);
	}
	
}
