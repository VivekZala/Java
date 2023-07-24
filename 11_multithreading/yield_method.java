/*
 * 	yield method will allow other threads to execute for some time.
 * 	This is introduced to overcome the problem of starvation.
 */

class yield_method {

	public static void main(String ...args) {

		MyThread th = new MyThread();
		th.start();

		int i = 1;
		while(true) {
			System.out.println(i++ + " Main");
			Thread.yield(); // Giving some time to execute MyThread.
		}

	}
}

class MyThread extends Thread {

	public void run() {
		int i = 1;
		while(true)
			System.out.println(i++ + " MyThread");
	}
}
