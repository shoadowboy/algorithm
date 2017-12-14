package com.demo.algorithm.array;

/**
 * Given a list of sorted characters letters containing only lowercase letters, 
 * and given a target letter target, find the smallest element in the list that
 *  is larger than the given target.
 *  Letters also wrap around. For example, if the target is target = 'z' 
 *  and letters = ['a', 'b'], the answer is 'a'.
 *  Note:
 *  1 letters has a length in range [2, 10000].
 *  2 letters consists of lowercase letters, and contains at least 2 unique letters.
 *  3 target is a lowercase letter.
 * @author peichunle
 * 思路：先判断是否大于最大，是取第一个，否，二分查找,!!!注意可能有重复的
 */
public class FindSmallestLetterGreaterThanTarget {
	public static char nextGreatestLetter(char[] letters, char target) {
		if(target<letters[0]||target>=letters[letters.length-1]){
			return letters[0];
		}
		int begin = 0;
		int end = letters.length-1;
		int mid =  (begin+end)/2;
		while(begin<end-1){
			if(letters[mid]<=target){
				begin = mid;
			}else{
				end = mid;
			}
			mid =  (begin+end)/2;
		}
		
		return letters[mid+1];
    }
	
	public static void main(String[] args) {
		char target='e';
		char[] letters={'e', 'e','e','n','n','n'};
		char nextGreatestLetter = nextGreatestLetter(letters, target);
		System.out.println(nextGreatestLetter);
	}
}
