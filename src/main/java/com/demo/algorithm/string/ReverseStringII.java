package com.demo.algorithm.string;

/**
 * Reverse String II
 * Given a string and an integer k, you need to reverse the first k characters for every 2k
 * characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        if(s==null||s.length()==0){
            return s;
        }
        int n = s.length()/(2*k);
        char[] charar = s.toCharArray();
        for(int i=0;i<n;i++){
            int begin = i*k;
            for(int j=0;j<=k/2;j++){
                char tmp = charar[begin+j];
                charar[begin+j]=charar [begin+k-j];
                charar [begin+k-j] = tmp;
            }
        }

        return s;
    }

}
