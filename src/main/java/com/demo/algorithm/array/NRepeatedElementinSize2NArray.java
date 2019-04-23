package com.demo.algorithm.array;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。(言外之意 其他N-1元素均不重复)
 * 返回重复了 N 次的那个元素。(重复元素必然会有一对间隔0或者间隔1)
 *
 */
public class NRepeatedElementinSize2NArray {

    public int repeatedNTimes(int[] A) {
        for (int i=2;i<A.length;i++){
            if (A[i]==A[i-1]||A[i]==A[i-2]){
                return A[i];
            }
        }
        return A[0];
    }

}
