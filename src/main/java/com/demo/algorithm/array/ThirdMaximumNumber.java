package com.demo.algorithm.array;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        if(nums==null||nums.length<3){
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
            if(set.size()<3&&!set.contains(nums[i])){
                set.add(nums[i]);
            }else{

            }


        }

        return 0;
    }

}
