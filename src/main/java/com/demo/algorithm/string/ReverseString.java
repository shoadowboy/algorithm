package com.demo.algorithm.string;

/**
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 * 目标在数组上原地旋转，使用O(1)的额外空间
 * @author peichunle
 *
 */
public class ReverseString {
    public static void rotateString(char[] str, int offset) {
        // write your code here
    	if(str.length==0){
    		return;
    	}
    	offset = offset%str.length;
    	if(offset<=0){
    		return ;
    	}
    	for(int i=0;i<(str.length-offset)/2;i++){
    		char tmp = str[i];
    		str[i] = str[str.length-offset-1-i];
    		str[str.length-offset-1-i] = tmp;
    	}
    	
    	for(int i=str.length-offset;i<str.length-offset/2;i++){
    		char tmp = str[i];
    		str[i] = str[str.length-i+str.length-offset-1];
    		str[str.length-i+str.length-offset-1] = tmp;
    	}
    	
    	for(int i=0;i<(str.length)/2;i++){
    		char tmp = str[i]; 
    		str[i] = str[str.length-i-1];
    		str[str.length-i-1] = tmp;
    		
		}
    }
    public static void main(String[] args) {
		char[] str = new char[]{'a','b','c','d'};
		rotateString(str , 2);
		
		for (char c : str) {
			System.out.println(c);
		}
	}
}
