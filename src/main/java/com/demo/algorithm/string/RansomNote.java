package com.demo.algorithm.string;

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
		if(magazine==null||magazine.length()==0){
			return false;
		}
		if(ransomNote==null||ransomNote.length()==0){
			return  true;
		}
		char[] charArray = magazine.toCharArray();
		for (char c : charArray) {
			
		}
		
        return true;
    }
}
