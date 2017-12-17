package com.demo.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Given n points in the plane that are all pairwise distinct, 
 * a "boomerang" is a tuple of points (i, j, k) such that the distance between 
 * i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and 
 * coordinates of points are all in the range [-10000, 10000] (inclusive).
 * Example
 * Input:
 * [[0,0],[1,0],[2,0]]
 * Output:
 * 2
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * @author peichunle
 * 思路：计算当前点和当前点之后的所有距离，
 *
 */
public class NumberofBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		int result = 0;
		HashMap<Long, Integer> dist = new HashMap<>();
		//这种会出现重复计算，
        for (int[] pi : points) {
            long xi = pi[0], yi = pi[1];

            for (int[] pj : points)
                if (pi != pj) {
                    long dx = xi - pj[0];
                    long dy = yi - pj[1];
                    long d = dx * dx + dy * dy;

                    Integer c = dist.getOrDefault(d, 0);
                    result += c * 2;
                    dist.put(d, c + 1);
                }

            dist.clear();
        }

        return result;
    }
}
