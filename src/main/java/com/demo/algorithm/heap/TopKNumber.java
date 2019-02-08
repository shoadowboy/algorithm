package com.demo.algorithm.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 小顶堆 实现
 *
 * @author peichunle
 */
public class TopKNumber {

    private class MinHeap {
        private int[] datas;

        public MinHeap(int size){
            this.datas = new int[size];
            for (int i = 0; i < datas.length; i++) {
                datas[i] = Integer.MIN_VALUE;
            }
        }



        private void buildHeap() {
            for (int i = 0; i <= datas.length / 2 - 1; i++) {
                rebuildNode(i);
            }
        }

        public void insertNum(int num) {
            if (num > datas[0]) {
                datas[0] = num;
                rebuildNode(0);
            }
        }

        private void rebuildNode(int i) {
            if (i > datas.length - 1) {
                return;
            }
            int left = 2 * i + 1;
            int right = left + 1;
            checkAndSwap(i,left );
            checkAndSwap(i,right);
        }

        private void checkAndSwap(int index, int targetIndex) {
            if (targetIndex > datas.length - 1) {
                return;
            }
            int tmp = datas[index];
            if (tmp > datas[targetIndex]) {
                datas[index] = datas[targetIndex];
                datas[targetIndex] = tmp;
                rebuildNode(targetIndex);
            }
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        MinHeap minHeap = new MinHeap(k);
        for (int i = 0; i < nums.length; i++) {
            minHeap.insertNum(nums[i]);
        }
        return Arrays.stream(minHeap.datas).boxed().collect(Collectors.toList());
    }

    public int findKthLargest(int[] nums, int k) {

        MinHeap minHeap = new MinHeap(k);
        for (int i =0; i < nums.length; i++) {
            minHeap.insertNum(nums[i]);
        }
        return minHeap.datas[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        int kthLargest = new TopKNumber().findKthLargest(nums, k);
        System.out.println(kthLargest);
    }
}
