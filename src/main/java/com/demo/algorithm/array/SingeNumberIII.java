package com.demo.algorithm.array;

public class SingeNumberIII {
    /**
     * 先求出这两个不同的数在哪些位出现了不同（temp），得到的 temp 为 这两个数出现“1”最小的那一位。（这两个数在这一位上一个为“0”，另一个为“1”）
     * 将数组按照在指定位置为0还是1进行区分
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        int tmp=0;
        for (int num : nums) {
            tmp = tmp^num;
        }
        // 1111
        //
        tmp =tmp&(-tmp);
        //tmp的每个位置是result1 和 result2 的不同的时候
        int result1 = 0;
        int result2 = 0;
        for (int num : nums) {
            if ((tmp&num)!=0){
                result1 = result1^num;
            }else {
                result2 = result2^num;
            }
        }
        return new int[]{result1,result2};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ints = new SingeNumberIII().singleNumber(nums);
        for (int num : ints) {
            System.out.println(num);
        }
    }
}
