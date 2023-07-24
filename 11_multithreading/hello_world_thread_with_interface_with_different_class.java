class hello_world_thread_with_interface_with_different_class {
    
    public static void main(String ...args) {

        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while(true)
            System.out.println((i++) + " World");
    }
}
class MyThread implements Runnable {
    public void run() {
        int i = 1;
        while(true)
            System.out.println((i++) + " Hello");
    }
}
