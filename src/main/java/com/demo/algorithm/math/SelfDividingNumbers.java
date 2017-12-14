package com.demo.algorithm.math;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0,
 *  and 128 % 8 == 0.
 *  Also, a self-dividing number is not allowed to contain the digit zero.
 * @author peichunle
 * Example 
 * Input: 
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 思路：直接遍历，分别判断
 */
public class SelfDividingNumbers {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i=left;i<=right;i++){
			if(checkIsSelfDividingNumbers(i)){
				result.add(i);
			}
		}
		return result;
    }
	
	private static boolean checkIsSelfDividingNumbers(int num){
		int orignNum = num;
		while(num!=0){
			if(num%10==0){
				return false;
			}
			if(orignNum%(num%10)!=0){
				return false;
			}
			num = num/10;
		}		
		return true;
	}
	
	public static void main(String[] args) {
		List<Integer> list = selfDividingNumbers(1, 12);
		System.out.println(list);
	}
}
