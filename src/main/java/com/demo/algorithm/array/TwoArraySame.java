package com.demo.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 计算两个数组的交 注意事项 每个元素出现次数得和在数组里一样 答案可以以任意顺序给出 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
 */
public class TwoArraySame {
	public int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] intersect = new int[nums1.length];
		int count = 0;
		for (int num : nums1) {
			if (map.containsKey(num)) {
				int nums = (Integer) map.get(num);
				map.put(num, nums + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (int num : nums2) {
			if (map.containsKey(num)) {
				intersect[count] = num;
				int nums = (Integer) map.get(num);
				if (nums == 1) {
					map.remove(num);
				} else {
					map.put(num, nums - 1);
				}
				count++;
			}
		}
		if (count != 0) {
			return Arrays.copyOf(intersect, count);
		} else {
			return new int[0];
		}
	}
}
