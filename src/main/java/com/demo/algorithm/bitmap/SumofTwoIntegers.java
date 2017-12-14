package com.demo.algorithm.bitmap;

/**
 * Calculate the sum of two integers a and b, 
 * but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 * @author peichunle
 *思路：异或运算，再考虑进位问题，如果int溢出怎么办？？？
 */
public class SumofTwoIntegers {
	public static int getSum(int a, int b) {
        if(a==0){
        	return b;
        }
        if(b==0){
        	return a;
        }
        return add(a, b);

    }
	
	private static int  add(int num1, int num2){
	    int sum = num1 ^ num2;
	    int carry = (num1 & num2) << 1;  
	    while(carry != 0){
	        int a = sum;
	        int b = carry;
	        sum = a ^ b;
	        carry = (a & b) << 1;  
	    }
	    return sum;
	}
	public static void main(String[] args) {
		System.out.println(getSum(1, -2));
	}
}
