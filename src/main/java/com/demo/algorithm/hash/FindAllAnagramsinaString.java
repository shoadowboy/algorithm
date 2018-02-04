package com.demo.algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 存hash,或者存数组，
 * @author peichunle
 *
 */
public class FindAllAnagramsinaString {
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		char[] charArray = p.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		char[] scharArray = s.toCharArray();
		int difference = 0;
		for(int i=0;i<p.length();i++){
			
		}
		
		return list;
    }
}
