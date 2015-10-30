import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

class MyCustomThread implements Runnable {

	/*
	Thread MyThread;
	MyCustomThread()
	{
		MyThread = new Thread(this);
		MyThread.start();
	}
	*/

	@Override
	public void run() {
		try
		{
			for (int i = 1; i <= 10; i++)
			{
				PrintWriter writer = null;
				try {
					writer = new PrintWriter("the-file-name-"+ Thread.currentThread().getId() + "-" + i +".txt", "UTF-8");
					//System.out.println("Creating the directory using saperate thredid :" + Thread.currentThread().getId());
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				writer.println("The first line");
				writer.println("The second line");
				writer.close();
			}
			Thread.sleep(5000);
			Thread.yield();
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class CreateNotepadMultiTreadingUsingRunnable {
	
	public static void main(String arg[]) throws Exception {
		
		Thread[] t = new Thread[5];
		for(int i = 1; i < t.length; i++)
		{
			t[i] = new Thread(new MyCustomThread());
			t[i].start();
		}
		System.out.println("file creation is started");
		try
	       {
	          while(t[4].isAlive())
	          {
	            //System.out.println("Main thread will be alive : ThreadId :" + MyThread1.getId()); 
	            Thread.sleep(1500);
	          }
	       }
	       catch(InterruptedException e)
	       {
	          System.out.println("Main thread interrupted");
	       }
		System.out.println("files are created");
	}
}

