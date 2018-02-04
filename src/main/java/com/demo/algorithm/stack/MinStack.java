package com.demo.algorithm.stack;

public class MinStack {
	   private class Node {
	        private int value;
	        private Node next;
	        private int min;      
	        Node(int v, int m, Node n) {
	            value = v;
	            min = m;
	            next = n;
	        }
	    }
	    
	    private Node stack;  
	    public MinStack() {   
	    }
	    
	    public void push(int x) {
	        if (stack == null) {
	            stack = new Node(x, x, null);
	        } else {
	            stack = new Node(x, Math.min(x, stack.min), stack);
	        }
	    }
	    public void pop() {
	        stack = stack.next;
	    }
	    
	    public int top() {
	        return stack.value;
	    }
	    
	    public int getMin() {
	        return stack.min;
	    }
	
}
