package com.demo.algorithm.array;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Example :
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * @author peichunle
 * 思路：
 * 1 直接分别遍历两个数组 o(m+n)复杂度
 * 2 采用二分。分别取每个数组的中位数
 * 
 *
 */
public class MedianTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int[] newArr = new int[(nums1.length+nums2.length)/2+1];
			
		return 0;
	}
	
	public static void main(String[] args) {
		int[] a={1,2};
		
		int[] b={3,4};
		
		double d = findMedianSortedArrays(a, b);
		System.out.println(d);
	}
}
