package com.demo.algorithm.string;

/**
 * 校驗是否是回文字符串
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        if(s==null||s.length()<=1){
            return true;
        }
        char[] charArray = s.toLowerCase().toCharArray();


        int left = 0;
        int right = charArray.length-1;
        while(left<=right-1){
            if(!isAlphanumeric(charArray[left])){
                left++;
                continue;
            }
            if(!isAlphanumeric(charArray[right])){
                right--;
                continue;
            }
            if(charArray[left]==charArray[right]){
                left++;
                right--;
            }else{
                return false;
            }

        }

        return true;
    }

    private static boolean isAlphanumeric(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("a a"));
    }
}
