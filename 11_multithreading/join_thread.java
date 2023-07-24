/*
 * 	Using join we force main method or any other method to wait until the thread complete it's execution
 */
class join_thread {

	public static void main(String ...args) {

		MyThread th = new MyThread();
		th.setDaemon(true);
		th.start();
		Thread mainThread = Thread.currentThread();
		try {
			mainThread.join(); // Though it is a daemon thread main method will wait.
		} catch(InterruptedException error) {
			System.out.println("Join Interrupted");
		}

	}
}

class MyThread extends Thread {

	public void run() {

		int i = 1;
		while(true)
			System.out.println(i++);
	}
}
