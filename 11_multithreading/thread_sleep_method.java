class thread_sleep_method {

	public static void main(String ...args) {
			
		MyThread th = new MyThread("Thread 1");
		th.start();
		// Interrupting a thread.
		// th.interrupt(); // Single interrupt.
		while(true) {
			th.interrupt();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException error) {
				System.out.println("Sleep Interrupted");
			}
		}
	}
}

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i++);
			try {
				Thread.sleep(1000); // micro-seconds (to delay in printing).
				// While in sleep this may be interrupted by other thread.
			} catch(InterruptedException error) {
				System.out.println("Sleep Interrupted");
			}
		}
	}
}
