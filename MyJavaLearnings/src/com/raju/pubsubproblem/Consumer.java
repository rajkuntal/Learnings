package com.raju.pubsubproblem;

import java.util.List;

public class Consumer implements Runnable{
		
		final List<Integer> ll;
		
		public Consumer(List<Integer> l) {
			// TODO Auto-generated constructor stub
			this.ll = l;
		}
		
		public void run() {
			while(true)
			{
				try	
				{
					RemoveFromList();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
		public void RemoveFromList() throws InterruptedException
		{
			synchronized(ll)
			{
				while(ll.isEmpty())
				{
					System.out.println("List is Empty" + Thread.currentThread().getName() + " is waiting");
					ll.wait();
				}
				int i = ll.remove(0);
				System.out.println("Removed : "+ i);
				ll.notify();
			}
		}

}
