package com.demo.algorithm.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * 滑动窗口
 * 
 * @author peichunle
 *
 */
public class FindAllAnagramsinaString {
	public  List<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer> result = new ArrayList<>();
		if (s == null || p == null){
			return result;
		}
		int left = 0;
		int right = 0;
		int count = p.length();
		int[] map = new int[256];
		char[] sc = s.toCharArray();
		for (char c : p.toCharArray()){
			map[c]++;
		}
		while (right < s.length()) {
			if (map[sc[right++]]-- >= 1){
				count--;
			}
			if (count == 0){
				result.add(left);
			}
			if (right - left == p.length() && map[sc[left++]]++ >= 0){
				count++;
			}
		}
		return result;
	}
}
