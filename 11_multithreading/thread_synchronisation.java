class thread_synchronisation {

	public static void main(String ...args) {
		
		MyData data = new MyData();
		MyThread1 th1 = new MyThread1(data);
		MyThread2 th2 = new MyThread2(data);
		th1.start();
		th2.start();
	}
}

class MyData {

	public void display(String str) {
		synchronized(this) {
			for(int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				try {
					Thread.sleep(1000);
				} catch(InterruptedException error) {
					System.out.println("Sleep Interrupted"); // There will not be any interuption because of synchronisation.
				}
			}
		}
	}
}

class MyThread1 extends Thread {

	MyData d;
	public MyThread1(MyData d) {
		this.d = d;
	}
	public void run() {
		d.display("Hello World");
	}
}

class MyThread2 extends Thread {

	MyData d;
	public MyThread2(MyData d) {
		this.d = d;
	}
	public void run() {
		d.display("Welcome");
	}
}
