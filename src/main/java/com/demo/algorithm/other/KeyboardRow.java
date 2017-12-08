package com.demo.algorithm.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet 
 * on only one row's of American keyboard like the image below.
 * 
 * Example
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 思路：存放一个hash 把每个字母对应的行计算出来
 * @author peichunle
 *
 */
public class KeyboardRow {
	public static String[] findWords(String[] words) {
		if(words == null||words.length==0){
			return words;
		}
		HashMap<Character,Integer> map = new HashMap<Character,Integer> (52);
		map.put('A', 2);
		map.put('B', 3);
		map.put('C', 3);
		map.put('D', 2);
		map.put('E', 1);
		map.put('F', 2);
		map.put('G', 2);
		map.put('H', 2);
		map.put('I', 1);
		map.put('J', 2);
		map.put('K', 2);
		map.put('L', 2);
		map.put('M', 3);
		map.put('N', 3);
		map.put('O', 1);
		map.put('P', 1);
		map.put('Q', 1);
		map.put('R', 1);
		map.put('S', 2);
		map.put('T', 1);
		map.put('U', 1);
		map.put('V', 3);
		map.put('W', 1);
		map.put('X', 3);
		map.put('Y', 1);
		map.put('Z', 3);
		
		map.put('a', 2);
		map.put('b', 3);
		map.put('c', 3);
		map.put('d', 2);
		map.put('e', 1);
		map.put('f', 2);
		map.put('g', 2);
		map.put('h', 2);
		map.put('i', 1);
		map.put('j', 2);
		map.put('k', 2);
		map.put('l', 2);
		map.put('m', 3);
		map.put('n', 3);
		map.put('o', 1);
		map.put('p', 1);
		map.put('q', 1);
		map.put('r', 1);
		map.put('s', 2);
		map.put('t', 1);
		map.put('u', 1);
		map.put('v', 3);
		map.put('w', 1);
		map.put('x', 3);
		map.put('y', 1);
		map.put('z', 3);
		
		
		boolean isLine = true;
		List<String> resutl = new ArrayList<String>();
		for (String string : words) {
			Integer line = map.get(string.charAt(0));
			for(int i=0;i<string.length();i++){
				if(map.get(string.charAt(i))!=line){
					isLine = false;
					break;
				}
				if(i==string.length()-1){
					isLine = true;
				}
			}
			if(isLine){
				resutl.add(string);
			}
		}
		
		return resutl.toArray(new String[resutl.size()]);
    }
	
	public static void main(String[] args) {
		String[] s = new String[]{"Hello", "Alaska", "Dad", "Peace"};
		String[] findWords = findWords(s);
		for (String string : findWords) {
			System.out.println(string);
		}
	}
}
