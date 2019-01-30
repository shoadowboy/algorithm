package com.demo.algorithm.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 图
 * 
 * @author PEICHUNLE575
 *
 */
public class Graph {
	/**
	 * 邻接矩阵
	 */
	private int[][] racs;

	/**
	 * 传入指定的邻接矩阵构建指定的图
	 * 
	 * @param racs
	 */
	public Graph(int[][] racs) {
		this.racs = racs;
	}

	public int[][] getRacs() {
		return this.racs;
	}

	/**
	 * 根据起点和终点查询两点的所有路径
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public List<String> findTraceFromBeginToEnd(int begin, int end) {
		// 定义一个栈，
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(begin);
		dfs(begin, end, stack);

		return null;
	}
	
	
	public List<String> findTraceFromBeginToEnd(int begin, int end,int maxStp) {
		// 定义一个栈，
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(begin);
		dfs(begin, end, stack,maxStp);

		return null;
	}
	
	
	public List<String> findTraceFromBeginToEnd(int begin, int end,int maxStep,int maxDistance) {
		// 定义一个栈，
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(begin);
		dfs(begin, end, stack,maxStep,maxDistance);

		return null;
	}


	/**
	 * 深度优先搜索算法，起始点和终点,不访问重复节点，
	 * 
	 * @param begin
	 * @param end
	 * @param isVisited
	 * @return
	 */
	public void dfs(int begin, int end, Stack<Integer> stack) {
		int[] distanceArr = racs[begin];
		for (int i = 0; i < distanceArr.length ; i++) {
			// 如果节点和下一个节点距离大于0说明有路径，并且没有访问过
			if (distanceArr[i] != -1) {
				if (i == end) {
					System.out.println(transferStackToPath(stack)+end);
				} else if (!stack.contains(i)) {
					stack.push(i);
					dfs(i, end, stack);
					stack.pop();
				}
				//其他情况：已经访问过，或者没有路径

			}
		}
	}
	
	public void dfs(int begin, int end, Stack<Integer> stack,int maxStep) {
		int[] distanceArr = racs[begin];
		for (int i = 0; i < distanceArr.length ; i++) {
			// 如果节点和下一个节点距离大于0说明有路径，并且没有访问过
			if (distanceArr[i] != -1) {
				if (i == end) {
					System.out.println("当前栈的深度："+stack.size());
					System.out.println(transferStackToPath(stack)+end);
					
				} else if (!stack.contains(i)&&stack.size()<maxStep) {
					stack.push(i);
					dfs(i, end, stack,maxStep);
					stack.pop();
				}
				//其他情况：已经访问过，或者没有路径

			}
		}
	}
	
	public void dfs(int begin, int end, Stack<Integer> stack,int maxStep,int maxdistance) {
		int[] distanceArr = racs[begin];
		for (int i = 0; i < distanceArr.length ; i++) {
			// 如果节点和下一个节点距离大于0说明有路径，并且没有访问过
			if (distanceArr[i] != -1) {
				if (i == end) {
					System.out.println(transferStackToPath(stack)+end);
					
				} else if (!stack.contains(i)&&stack.size()<maxStep) {
					stack.push(i);
					dfs(i, end, stack);
					stack.pop();
				}
				//其他情况：已经访问过，或者没有路径

			}
		}
	}
	
	
	/**
	 * 判断
	 * @param begin
	 * @param end
	 * @param stack
	 * @param maxStep
	 * @param maxdistance
	 * @param curDistance
	 */
	public void dfs(int begin, int end, Stack<Integer> stack,int maxStep,int maxdistance,int curDistance) {
		int[] distanceArr = racs[begin];
		for (int i = 0; i < distanceArr.length ; i++) {
			//如果设置
			
			// 如果节点和下一个节点距离大于0说明有路径，并且没有访问过
			if (distanceArr[i] != -1) {
				//如果最大距离为负数，不需要考虑 说明不考虑距离，
				//如果最大距离不为负数，需要当前距离加上下一个节点距离小于等于最大距离即可
				if(maxdistance<0||distanceArr[i]+curDistance<=maxdistance){
					if (i == end) {
						System.out.println(transferStackToPath(stack)+end);
						
					} else if (!stack.contains(i)) {
						//1 如果最大步数为负数，说明无最大步数限制要求 2最大步数为正数，需要判断栈的深度
						if(maxStep<0||stack.size()<maxStep){
							stack.push(i);
							dfs(i, end, stack,maxStep,maxdistance,curDistance+distanceArr[i]);
							stack.pop();
						}
					}
				}
				//其他情况：已经访问过，或者没有路径

			}
		}
	}
	
	public void dfsWhithSpecifiedStep(int begin, int end, Stack<Integer> stack,int step) {
		int[] distanceArr = racs[begin];
		for (int i = 0; i < distanceArr.length ; i++) {
			//如果设置
			
			// 如果节点和下一个节点距离大于0说明有路径，并且没有访问过
			if (distanceArr[i] != -1) {
					//判断指定节点位置栈深度和指定步数是否合法
					if (i == end&&stack.size()==step) {
						System.out.println(transferStackToPath(stack)+end);
						
					} else if (!stack.contains(i)) {
						if(stack.size()<step){
							stack.push(i);
							dfs(i, end, stack,step);
							stack.pop();
						}
					}

			}
		}
	}
	

	
	
	private String transferStackToPath(Stack<Integer> statck) {
		StringBuffer sb = new StringBuffer();
		for (Integer integer : statck) {
			sb.append(integer);
		}
		return new String(sb);
	}

	/**
	 * 纯暴力，计算所有节点的最短距离
	 * 
	 * @return
	 */
	public void floyd(int[][] path, int[][] dist) {
		
		//k个顶点
		int vetnum = racs.length;
	    // 初始化
	    for (int i = 0; i < vetnum; i++) {
	        for (int j = 0; j < vetnum; j++) {
	            dist[i][j] = racs[i][j];    // "顶点i"到"顶点j"的路径长度为"i到j的权值"。
	            path[i][j] = j;                // "顶点i"到"顶点j"的最短路径是经过顶点j。
	        }
	    }

	    // 计算最短路径
	    for (int k = 0; k < vetnum; k++) {
	        for (int i = 0; i < vetnum; i++) {
	            for (int j = 0; j < vetnum; j++) {

	                // 如果经过下标为k顶点路径比原两点间路径更短，则更新dist[i][j]和path[i][j]
	                int tmp = (dist[i][k]==-1 || dist[k][j]==-1) ? -1 : (dist[i][k] + dist[k][j]);
	                if (dist[i][j] > tmp) {
	                    // "i到j最短路径"对应的值设，为更小的一个(即经过k)
	                    dist[i][j] = tmp;
	                    // "i到j最短路径"对应的路径，经过k
	                    path[i][j] = path[i][k];
	                }
	            }
	        }
	    }

	}

	/**
	 * 查找指定路径的距离，不存在该路径则返回-1
	 * 
	 * @param list
	 * @return
	 */
	public int searchPathDistance(LinkedList<Integer> list) {
		if (null == list || list.size() < 1) {
			return -1;
		}
		int length = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			// 如果是同一个节点，设置为0？
			if (list.get(i) != list.get(i + 1)) {
				int distance = racs[list.get(i)][list.get(i + 1)];
				if (racs[list.get(i)][list.get(i + 1)] == -1) {
					return -1;
				} else {
					length += distance;
				}
			}
		}
		if (length > 0) {
			return length;
		}
		return -1;
	}

}
