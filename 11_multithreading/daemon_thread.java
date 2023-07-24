/*
 * 	If main method comes to an end but still thread will continue to execute and main will wait.
 * 	So to make that thread end when main method end we make that thread daemon.
 * 	Means if main ends thread should also end.
 * 	Daemon threads are dependent threads.
 */

class daemon_thread {

	public static void main(String ...args) {

		MyThread th = new MyThread();
		th.setDaemon(true);
		th.start();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException error) {
			System.out.println("Sleep Interrupted");
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
