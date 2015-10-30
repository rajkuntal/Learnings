package com.raju.multithreating;

public class MyThread extends Thread {
	
	int i = 0;
	
	public MyThread(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
		
	public void run() {
		
		for(i = 1; i < 11 ; i++)
		{
			if(getName().equals("Even"))
			{
				if(i%2 == 0)
				{
					System.out.println(getName()+ ":" + i);
					notify();
				}
				else
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else
			{
				if(getName().equals("Odd"))
				{
					if(i%2 != 0)
					{
						System.out.println(getName()+ ":" + i);
						notify();
					}
					else
					{
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
