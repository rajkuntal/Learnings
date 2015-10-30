package com.raju.racecondition3;

public class NumberTransaction {

	Integer count = 0;
	
	public void evenNumber() {

		synchronized (count) {
			if(count < 100 && count % 2 != 0)
			{
				count++;
				System.out.println("Thread :" + Thread.currentThread().getName()+" -- Count : " + count);
			}
		}
	}
	
	public void oddNumber() {

		synchronized (count) {
			if(count < 100 && count % 2 == 0)
			{
				count++;
				System.out.println("Thread :" + Thread.currentThread().getName()+" -- Count : " + count);
			}
		}
	}
}
