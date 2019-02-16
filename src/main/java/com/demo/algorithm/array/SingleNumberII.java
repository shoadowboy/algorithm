package com.demo.algorithm.array;

public class SingleNumberII {
    /**
     * bitmap
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        // int 最大值
        for(int i=0;i<32;i++){
            int sum = 0;
            for(int n:nums){
                sum += (n>>i)&1;
            }
            result |= sum%3 << i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(2^2^2^3^1^1^1);
        System.out.println(2&2&3&2&1&1&1);
    }
}
