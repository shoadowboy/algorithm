package com.demo.algorithm.array;

/**
 * @author peichunle
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * 给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
 *
 */
public class MergeTwoSortArray {
	public int[] mergeSortedArray(int[] A, int[] B) {
		int[] arr = new int[A.length + B.length];
		int aindex = 0;
		int bindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (aindex == A.length) {
				arr[i] = B[bindex];
				bindex = bindex + 1;
			} else if (bindex == B.length) {
				arr[i] = A[aindex];
				aindex = aindex + 1;
			} else if (aindex == A.length || A[aindex] <= B[bindex]) {
				arr[i] = A[aindex];
				aindex = aindex + 1;
			} else if (A[aindex] > B[bindex]) {
				arr[i] = B[bindex];
				bindex = bindex + 1;
			}

		}
		return arr;
	}
}
