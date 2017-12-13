package com.demo.algorithm.string;

/**
 * Given a string, you need to reverse the order of characters in each word within
 *  a sentence while still preserving whitespace and initial word order.
 *  Example :
 *  Input: "Let's take LeetCode contest"
 *  Output: "s'teL ekat edoCteeL tsetnoc"
 *  
 * @author peichunle
 * 思路：遍历每个单词，记录下单词起点和终点，然后翻转这个单词
 */
public class ReverseWordsString {
	public static String reverseWords(String s) {
		if(s==null||s.length()==0){
			return s;
		}
		
		char[] charArray = s.toCharArray();
		int wordsbegin = 0;
		int wordsend = 0;
		boolean prefixSpace = true;
		for(int i=0;i<charArray.length;i++){
			if(prefixSpace){
				if(charArray[i]==32){
					continue;
				}else{
					wordsbegin= i;
					prefixSpace = false;
				}
			}else{
				if(charArray[i]==32){
					wordsend= i-1;
					prefixSpace = true;
					//翻转单词
					reverseWords(charArray, wordsbegin, wordsend);
				}else{
					if(i==charArray.length-1){
						wordsend= i;
						reverseWords(charArray, wordsbegin, wordsend);
					}
					continue;
				}
			}
		}
		
		return  new String(charArray);
    }
	
	private static void reverseWords(char[] chararr,int begin,int end){
		for(int i=begin;i<=(begin+end)/2;i++){
			char tmp = chararr[i];
			chararr[i] = chararr[end+begin-i];
			chararr[end+begin-i] = tmp;
		}
		System.out.println(new String(chararr));
	}
	
	public static void main(String[] args) {
		String reverseWords = reverseWords("Let's take LeetCode contest");
		System.out.println(reverseWords);
	}
}
