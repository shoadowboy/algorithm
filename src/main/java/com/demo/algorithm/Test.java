package com.demo.algorithm;

import com.demo.algorithm.graph.Graph;

public class Test {
	public static void main(String[] args) {
			int[][] racs = { 
		            {-1, 5, -1, 5, 7}, 
		            {-1, -1, 4, -1, -1},
		            {-1, -1, -1, 8, 2},
		            {-1, -1, 8, -1, 6},
		            {-1, 3, -1, -1, -1},
		    };
			Graph graph = new Graph(racs);
			
			int[][] dist = new int[racs.length][racs.length];
			int[][] path = new int[racs.length][racs.length];
			graph.floyd(path, dist);
			
			for (int[] is : dist) {
				for(int i=0;i<is.length;i++){
					if(i==is.length-1){
						System.out.println(is[i]);
					}else{
						System.out.print(is[i]+" ");
					}
				}
			}
	}
	
}
