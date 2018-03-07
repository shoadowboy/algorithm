package com.demo.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角 只用o（K）空间
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0){
            List<Integer> list = new  ArrayList<Integer>();
            return list;
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int i=1;i<=rowIndex;i++){
            for(int j=list.size()-2;j>=0;j--){
                list.set(j+1,list.get(j)+list.get(j+1));
            }
            list.add(1);

        }
        return  list;

    }
}
