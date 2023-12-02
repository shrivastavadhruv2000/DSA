package com.demo.lab_12;

import java.util.Hashtable;

public class Fibonacii {
    private static Hashtable<Integer,Long> memo = new Hashtable<>();
    
    public static void main(String[] args) {
		int n=10;
		long result=Fibonacci(n);
		System.out.println("Fibonacci "+n+" ="+result);
	}
    
    public static long Fibonacci(int n) {
		
    	if(n<0) {
    		throw new IllegalArgumentException("I/P must be non negative integer...");
    	}
    	
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		long result=Fibonacci(n-1)+Fibonacci(n-2);
		memo.put(n, result);
		return result;
    	
    	
    }

}
