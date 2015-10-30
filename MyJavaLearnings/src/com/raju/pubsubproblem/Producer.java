package com.raju.pubsubproblem;

import java.util.List;

public class Producer implements Runnable {
	
	final List<Integer> ll ;
	final int size;
	
	public Producer(List<Integer> l, int s) {
		// TODO Auto-generated constructor stub
		this.ll = l;
		this.size = s;
	}
	
	public void run() {
		int counter = 0;
		while(true)
		{
			try
			{
				FillList(counter++);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	public void FillList(int i) throws InterruptedException
	{
		synchronized(ll)
		{
			while(ll.size() == size)
			{
				System.out.println("List is full" + Thread.currentThread().getName() + " is waiting");
				ll.wait();
			}
			ll.add(i);
			System.out.println("Added : "+ i);
			ll.notify();
		}
	}

}
