package com.demo.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters 
 * from all the magazines, write a function that will return true if the ransom 
 * note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * Example:
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * @author peichunle
 * 思路：第二个字符串存hash
 *
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		if(magazine==null||ransomNote==null){
			return false;
		}
		if(ransomNote.length()>magazine.length()){
			return false;
		}
		if(ransomNote.length()==0){
			return true;
		}
		char[] charArray = magazine.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (char c : charArray) {
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		//
		for(int i=0;i<ransomNote.length();i++){
			char c = ransomNote.charAt(i);
			if(!map.containsKey(c)){
				return  false;
			}else{
				Integer integer = map.get(c);
				if(integer==1){
					map.remove(c);
				}else{
					map.put(c, integer-1);
				}
			}
		}
        return true;
    }
}
