package com.demo.algorithm.dynamicprogramming;

/**
 * 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
 *
 * 例如， [1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 *
 * 给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
 *
 */
public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums) {
        // 正负 正负切换
        if (nums.length<2){
            return nums.length;
        }
        // 从 0开始找到第一个前n个数不相等的

        int beginIndex = -1;
        // 一个数组全部相等的话返回1
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                beginIndex = i-1;
                break;
            }
        }
        if (beginIndex==-1){
            return 1;
        }

        // 当前节点肯定是非相等的两个数
        boolean nextShouldUp = nums[beginIndex+1]-nums[beginIndex]<0;
        int maxLength = 2;
        int currenrMaxOrMin = nums[beginIndex+1];
        for (int i=beginIndex+2;i<nums.length;i++){
            if (nextShouldUp){
                if (nums[i]>currenrMaxOrMin){
                    maxLength+=1;
                    nextShouldUp = !nextShouldUp;
                }
            }else {
                if (nums[i]<currenrMaxOrMin){
                    maxLength+=1;
                    nextShouldUp = !nextShouldUp;
                }
            }
            currenrMaxOrMin = nums[i];
        }
        return maxLength;
    }


    /**
     * example
     * @param nums
     * @return
     */
    public int wiggleMaxLength2(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int up = 1;
        int down = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            }
            if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
    public static void main(String[] args) {
//        int[] nums ={1,7,4,9,2,5}; 6
//        int[] nums ={1,17,5,10,13,15,10,5,16,8}; 7
        int[] nums ={1,2,3,4,5,6,7,8,9}; //2
        int i = new WiggleSubsequence().wiggleMaxLength(nums);
        System.out.println(i);
    }
}
