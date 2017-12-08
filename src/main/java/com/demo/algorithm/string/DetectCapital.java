package com.demo.algorithm.string;

/**
 * 判断一个字符串是否	全部是大写或者全部是小写
 * @author peichunle
 *
 */
public class DetectCapital {
	public boolean detectCapitalUse(String word) {
		if(word==null||word.length()<=1){
			return true;
		}
		boolean firstFlagIsUpper = false;
		
		boolean secondFlagIsUpper = false;
		for(int i=0;i<word.length();i++){
			if(i==0){
				if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
					firstFlagIsUpper = true;
				}
			}
			if(firstFlagIsUpper&&i>1){
				
			}
		}
        return false;
    }
}
