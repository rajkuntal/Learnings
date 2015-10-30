package com.raju.racecondition3;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NumberTransaction num = new NumberTransaction();
		for(int i = 0; i <= 49; i++)
		{
			NumberPrinter obj = new NumberPrinter(0,num);
			Thread th = new Thread(obj,"even");
			th.start();
		}
		
		for(int i = 0; i <= 49; i++)
		{
			NumberPrinter obj = new NumberPrinter(1,num);
			Thread th = new Thread(obj,"odd");
			th.start();
		}	
	
		System.out.println("Numbers are printed");
			
	}
}
