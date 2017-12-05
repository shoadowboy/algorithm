package com.demo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static int[] twoSum(int[] numbers, int target) {
    	if(numbers==null||numbers.length<2){
    		return null;
    	}
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0;i<numbers.length;i++){
    		map.put(numbers[i], i+1);
		}
    	for(int i=0;i<=numbers.length-1;i++){
    		if(map.containsKey(target-numbers[i])){
    			return new int[]{i+1,map.get(target-numbers[i])};
    		}
    	}
    	
    	return null;
    }
    
    public static void main(String[] args) {
		int[] a = new int[]{1,0,-1};
		int[] twoSum = twoSum(a, -1);
		for (int i : twoSum) {
			System.out.println(i);
		}
	}
}
