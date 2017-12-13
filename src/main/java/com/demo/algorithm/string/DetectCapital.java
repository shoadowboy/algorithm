package com.demo.algorithm.string;

/**
 * 判断一个字符串是否	全部是大写或者全部是小写
 * @author peichunle
 *
 */
public class DetectCapital {
	public static boolean detectCapitalUse(String word) {
		if(word==null||word.length()<=1){
			return true;
		}
		if(word.length() ==2){
			if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
				return true;
			}
			if(word.charAt(0)>='a'&&word.charAt(0)<='z'&&word.charAt(1)>='a'&&word.charAt(1)<='z'){
				return true;
			}else{
				return false;
			}
		}
		boolean firstFlagIsUpper = true;
		if(word.charAt(0)>='a'&&word.charAt(0)<='z'){
			firstFlagIsUpper = false;
		}
		boolean secondFlagIsUpper = false;
		if(word.charAt(1)>='A'&&word.charAt(1)<='Z'){
			secondFlagIsUpper = true;
		}
		if(!firstFlagIsUpper){
			if(secondFlagIsUpper){
				return false;
			}
		}
		for(int i=0;i<word.length();i++){
			if(i==0||i==1){
				continue;
			}else{
				if(secondFlagIsUpper){
					if(word.charAt(i)>='a'&&word.charAt(i)<='z'){
						return false;
					}
				}else{
					if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
						return false;
					}
				}
			}
		}
        return true;
    }
	
	public static void main(String[] args) {
		boolean detectCapitalUse = detectCapitalUse("mRZ");
		System.out.println(detectCapitalUse);
	}
}
