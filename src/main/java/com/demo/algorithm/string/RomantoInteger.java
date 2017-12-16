package com.demo.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * 
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * @author peichunle
 *没啥说的直接用Integer ascll码转
 */
public class RomantoInteger {
	public int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>() {
	        {
	            put('I', 1);
	            put('V', 5);
	            put('X', 10);
	            put('L', 50);
	            put('C', 100);
	            put('D', 500);
	            put('M', 1000);
	        }
	    };
	    
	    int length = s.length();
        int result = 0;
        int preVal = 0;
        for (int i = length - 1; i >= 0; i--) {
            char key = s.charAt(i);
            int value = map.get(key);
            if (value >= preVal) {
                result += value;
            } else {
                result -= value;
            }

            preVal = value;
        }
        return result;
    }
}
