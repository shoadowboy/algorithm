package com.demo.algorithm.array;

/**
 * 在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 给你一个数组，求出这个数组中逆序对的总数。概括
 * ：如果a[i] > a[j] 且 i < j， a[i] 和 a[j] 构成一个逆序对。
 * 
 * @author peichunle
 *
 */
public class ReversePairs {
	
	public long reversePairs(int[] A) {
		//复杂度o(n^2) 后续优化
		long count = 0;

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[i] > A[j]) {
					count++;
				}
			}
		}

		return count;
	}
}
