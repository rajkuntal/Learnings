package com.raju.problems;

public class RecurssionProblems {
	
	
	public static void main(String[] args) {
		RecurssionProblems obj = new RecurssionProblems();
		
		System.out.println(obj.tringularNumR(3));
	}
	
	public int tringularNumR(int num) {
		
		System.out.println("Method: " + num);
		int result;
		
		if (num == 1)
		{
			System.out.println("Return 1");
			return num;
		}
		else
		{
			
			result = num + tringularNumR(num - 1) ;
			System.out.println("Mothod call :"+ num + "+ tringularNumR(" + num + "-1)");			
			System.out.println("Return result" + result);
			return result;
		}		
	}

}

