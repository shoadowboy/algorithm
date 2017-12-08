package com.demo.algorithm.other;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		String fizzBuzz = "FizzBuzz";
		String fizz = "Fizz";
		String buzz = "Buzz";
        List<String> list = new ArrayList<String>(n);
        for(int i=1;i<=n;i++){
        	if(i%3==0&&i%5==0){
        		list.add(fizzBuzz);
        	}else if(i%3==0){
        		list.add(fizz);
        	}else if(i%5==0){
        		list.add(buzz);
        	}else{
        		list.add(String.valueOf(i));
        	}
        }
        return list;
    }
	
	
	public static void main(String[] args) {
		List<String> list = fizzBuzz(15);
		System.out.println(list);
	}
}
