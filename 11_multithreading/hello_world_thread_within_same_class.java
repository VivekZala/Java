public class hello_world_thread_within_same_class extends Thread {
    
    public void run() {
        int i = 1;
        while(true)
            System.out.println((i++) + " Hello");
    }

    public static void main(String ...args) {
        hello_world_thread_within_same_class t = new hello_world_thread_within_same_class();
        t.start();

        int i = 1;
        while(true)
            System.out.println((i++) + " World");
    }
}
