package com.demo.algorithm.math;

/**
 * Given a non-negative integer num,
 *  repeatedly add all its digits until the result has only one digit.
 *  For example:
 *  Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2.
 *   Since 2 has only one digit, return it.
 *   Follow up:
 *   Could you do it without any loop/recursion in O(1) runtime?
 * @author peichunle
 * 思路：不限时间的话用递归，限制时间需要总结规律 
 * 输入：1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20
 * 输出：1，2，3，4，5，6，7，8，9，1，2，3，4，5，6，7，8，9，1，2
 * （N-1）%9+1
 */
public class AddDigits {
	public int addDigits(int num) {
		return (num-1)%9+1;
    }
}
