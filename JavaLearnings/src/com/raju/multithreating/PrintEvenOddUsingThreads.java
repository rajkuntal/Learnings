package com.raju.multithreating;

public class PrintEvenOddUsingThreads {
	
	public static void main(String[] args) {
		
		Thread A = new MyThread("Even");
		Thread B = new MyThread("Odd");
		
		A.start();
		B.start();
	}

}
