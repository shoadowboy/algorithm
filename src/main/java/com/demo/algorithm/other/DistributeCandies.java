package com.demo.algorithm.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array with even length, 
 * where different numbers in this array represent different kinds of candies.
 *  Each number means one candy of the corresponding kind. 
 *  You need to distribute these candies equally in number to brother and sister. 
 * Return the maximum number of kinds of candies the sister could gain.
 * Example 
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * @author peichunle
 * 思路：过半最大就是一半，不过半就是最大不同的数
 *
 */
public class DistributeCandies {
	public static int distributeCandies(int[] candies) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int diffrentKinds = 0;
		for (int i : candies) {
			if(!map.containsKey(i)){
				map.put(i, i);
				diffrentKinds++;
			}
			if(diffrentKinds>candies.length/2){
				return candies.length/2;
			}
		}
		return diffrentKinds;
    }
	
	public static void main(String[] args) {
		int[] candies = {1,1,2,3};
		int distributeCandies = distributeCandies(candies);
		System.out.println(distributeCandies);
	}
}
