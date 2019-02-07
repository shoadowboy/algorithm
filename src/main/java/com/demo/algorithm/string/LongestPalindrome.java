package com.demo.algorithm.string;

public class LongestPalindrome {


    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        int maxlength = 1;
        int begin = 0;
        for (int i = 0; i < len - 1; i++) {
            // 先判断*a*
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }
                if (right - left + 1 > maxlength) {
                    maxlength = right - left + 1;
                    begin = left;
                }
                left--;
                right++;
            }
            // 考虑是***aa***情况
            if (s.charAt(i) == s.charAt(i + 1)) {
                left = i;
                right = i + 1;
                while (left >= 0 && right < len) {
                    if (s.charAt(left) != s.charAt(right)) {
                        break;
                    }
                    if (right - left + 1 > maxlength) {
                        maxlength = right - left + 1;
                        begin = left;
                    }
                    left--;
                    right++;
                }
            }
        }
        return s.substring(begin, begin + maxlength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bmmm"));
    }

}
