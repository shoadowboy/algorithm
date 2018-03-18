package com.demo.algorithm.array;

/**
 *合并两个排序好的数组，n1 无限大
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergeArrIndex = m+n-1;
        m--;
        n--;
        while(mergeArrIndex >= 0){

            if(m>=0&&n>=0&&nums1[m]>nums2[n]){
                nums1[mergeArrIndex] = nums1[m];
                m--;
            }else if(n<0){
                nums1[mergeArrIndex] = nums1[m];
                m--;
            }else{
                nums1[mergeArrIndex] = nums2[n];
                n--;
            }
            mergeArrIndex--;
        }
    }

    public static void main(String[] args) {
        int[] nums2 ={1,2,4};
        int[] nums1 = new int[5];
        nums1[0] = 2;
        nums1[1] = 3;
        merge(nums1,2,nums2,3);

        for(int i=0;i<5;i++){
            System.out.println(nums1[i]);
        }
    }
}
