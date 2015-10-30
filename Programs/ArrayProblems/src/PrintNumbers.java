
public class PrintNumbers {

	int i = 0;
	int j = 1000;

	public Object ob = new Object();

	public static void main(String[] args) {

		final PrintNumbers obj = new PrintNumbers();

		Thread th1 = new Thread(new Runnable() {
			public void run() {
				obj.even();
			}
		});

		th1.setName("Even");

		Thread th2 = new Thread(new Runnable() {
			public void run() {
				obj.odd();
			}
		});

		th2.setName("Odd");

		th1.start();
		th2.start();

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Program finised");

	}

	public void odd() {
		while (i < j) {
			if (i % 2 == 0) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			System.out.println("i :" + i + " Thread Name :" + Thread.currentThread().getName());
			i++;
			synchronized (this) {
				notifyAll();
			}
		}
	}

	public void even() {
		while (i < j) {
			if (i % 2 != 0) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			System.out.println("i :" + i + " Thread Name :" + Thread.currentThread().getName());
			i++;
			synchronized (this) {
				notifyAll();
			}
		}
	}

}
