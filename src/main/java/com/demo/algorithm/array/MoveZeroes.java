package com.demo.algorithm.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while 
 * maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
 * nums should be [1, 3, 12, 0, 0].
 * note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * @author peichunle
 * 思路：从头开始遍历，碰到第一个为0的然后从第一个为0的节点往后遍历到第一个不为0的，交换位置
 *
 */
public class MoveZeroes {
	/**
	 * n（n^2）
	 */
//	public static void moveZeroes(int[] nums) {
//		if(nums==null){
//			return ;
//		}
//		int slow = 0;
//		int fast = 0;
//		while(fast<nums.length){
//			if(nums[fast]==0){
//				//从当前节点开始遍历下一个不为0的
//				slow=fast;
//				while(slow<=nums.length-1){
//					if(nums[slow]!=0){
//						int tmp =nums[fast];
//						nums[fast] = nums[slow];
//						nums[slow] = tmp;
//						break;
//					}
//					slow++;
//				}
//			}
//			fast++;
//		}
//		
//    }
	/**
	 * 类似冒泡
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int left = 0; 
        int right = 0;
        while (right < nums.length){
            if (nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}
}	
