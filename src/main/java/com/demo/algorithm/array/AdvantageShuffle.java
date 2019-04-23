package com.demo.algorithm.array;


import java.util.*;

/**
 * 给定两个大小相等的数组 A 和 B，A 相对于 B 的优势可以用满足 A[i] > B[i] 的索引 i 的数目来描述。
 *
 * 返回 A 的任意排列，使其相对于 B 的优势最大化。
 * 田忌赛马 a当前 对上b中正好最接近的小于a的当前最大值的数
 */
public class AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        int[] res = new int[A.length];
        List<Pair> p=new ArrayList<Pair>();
        for(int i = 0; i<B.length; i++){
            p.add(new Pair(B[i],i));
        }
        Collections.sort(p);
        Arrays.sort(A);

        int left = 0; int right = A.length-1;
        for(int i = 0; i < p.size(); i++){
            int num = p.get(i).num;
            if(A[right] > num){
                res[p.get(i).index] = A[right];
                right--;
            }
            else{
                res[p.get(i).index] = A[left];
                left++;
            }
        }
        return res;
    }

    class Pair implements Comparable{
        int num;
        int index;

        public Pair(int n, int m){
            this.num = n;
            this.index = m;
        }

        public int compareTo(Object o){
            Pair p =(Pair)o;
            if(this.num < p.num)
                return 1;
            if(this.num > p.num)
                return -1;
            return 0;
        }
    }

}
