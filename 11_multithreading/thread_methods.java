class thread_method {

	public static void main(String ...args) {
		
		MyThread t = new MyThread("Thread 1");
		System.out.println("State before thread start: " + t.getState());
		t.start();
		System.out.println("Thread ID: " + t.getId());
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());
		System.out.println("State after thread started: " + t.getState());
		System.out.println("Alive: " + t.isAlive());
	}
}

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
}
