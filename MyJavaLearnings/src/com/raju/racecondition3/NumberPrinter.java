package com.raju.racecondition3;

public class NumberPrinter implements Runnable {

	int printType;
	public NumberTransaction num;
	
	public NumberPrinter(int i, NumberTransaction number) {
		// TODO Auto-generated constructor stub
		this.printType = i;
		this.num = number;
	}

	@Override
	public void run() {
		if(printType == 0)
		{
			printEven();
			//printNumber();
		}
		else
		{
			printOdd();
			//printNumber();
		}
	}
	
	public void printEven() {
		this.num.evenNumber();
	}
	public void printOdd() {
		this.num.oddNumber();
	}
	public void printNumber() {
		System.out.println("Thread :" + Thread.currentThread().getName()+" -- Count : " + this.num.count);
		
	}
}
