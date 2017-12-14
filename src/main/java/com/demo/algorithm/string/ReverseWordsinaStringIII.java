package com.demo.algorithm.string;

/**
 * Given a string, you need to reverse the order of characters in each word within
 *  a sentence while still preserving whitespace and initial word order.
 *  Example :
 *  Input: "Let's take LeetCode contest"
 *  Output: "s'teL ekat edoCteeL tsetnoc"
 *  思路：
 *  
 * @author peichunle
 *
 */
public class ReverseWordsinaStringIII {
	public String reverseWords(String s) {
		if(s==null){
			return s;
		}
		boolean preIsSpace = true;
		char[] charArray = s.toCharArray();
		int begin=0;
		int end = 0;
		for(int i=0;i<charArray.length;i++){
			if(preIsSpace){
				if(charArray[i]!=32){
					preIsSpace = false;
					begin = i;
				}
			}
				
				
		}
		return  s;
    }
}
