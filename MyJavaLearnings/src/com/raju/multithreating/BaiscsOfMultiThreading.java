package com.raju.multithreating;

public class BaiscsOfMultiThreading {

	public static boolean isTrue = false;
	public static int s = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaiscsOfMultiThreading x = new BaiscsOfMultiThreading();
		MyMethods m = MyMethods.getInstence();
		for(int i =0 ; i< 5; i++)
		{
			Thread th = x.new Mythread(1,m);
			th.setName("odd");
			th.start();
		}
		
		for(int i =0 ; i< 5; i++)
		{
			Thread th = x.new Mythread(0,m);		
			th.setName("Even");
			th.start();
		}
		
	}
	
	class Mythread extends Thread
	{
		int type;
		MyMethods mObj;
		public Mythread(int i, MyMethods m) {
			type = i;
			mObj = m;
		}
		
		public void run(){
			mObj.printHere(0);					
		}
	};
	
	public static class MyMethods
	{
		int num;
		Integer i = 0;
		public static MyMethods mObj = null;
		private MyMethods(){
		}
		public static MyMethods getInstence() {
			while(mObj == null)
			{
				synchronized (MyMethods.class) {
					mObj = new MyMethods();
				}
			}
			return mObj;
		}
		
		public void even() {
			synchronized (this) {
				while(i.intValue() % 2 == 0)
				{
					try {
						this.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "  -- Thread :" + " is waiting");
				}
				i++;
				this.notify();
				System.out.println("num :" + i.intValue() + " Thread :" + Thread.currentThread().getName());
			}
		}
		
		public void odd() {
			synchronized (this) {
				if(i.intValue() % 2 != 0)
				{
					try {
						this.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "  -- Thread :" + " is waiting");
				}
				i++;
				this.notify();
				System.out.println("num :" + i.intValue() + " Thread :" + Thread.currentThread().getName());
			}
			
		}
		
		public synchronized void printHere(int n){
			if(Thread.currentThread().getName().equals("Even"))
			{
				if(i.intValue() % 2 != 0)
				{				
					i++;
					this.notify();
					System.out.println("num :" + i.intValue() + " Thread :" + Thread.currentThread().getName());
				}
				else
				{
					try {
						this.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "  -- Thread :" + " is waiting");
				}
			}
			
			if(Thread.currentThread().getName().equals("Odd"))
			{
				if(i.intValue() % 2 == 0)
				{				
					i++;
					this.notify();
					System.out.println("num :" + i.intValue() + " Thread :" + Thread.currentThread().getName());
				}
				else
				{
					try {
						this.wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "  -- Thread :" + " is waiting");
				}
			}
		}
	}
	
	public static void display() {
		
		if(Thread.currentThread().getName().equals("Odd") && s <= 10 )
			System.out.println("This is Odd Thread :" + Thread.currentThread().getName() + " S :" + s++);
		
		if(Thread.currentThread().getName().equals("Even") && s <= 10)
			System.out.println("This is Even Thread :" + Thread.currentThread().getName() + " S :" + s++);
	}
}
