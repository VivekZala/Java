public class hello_world_thread_with_interface_within_same_class implements Runnable{
    
    public void run() {
        int i = 1;
        while(true)
            System.out.println((i++) + " Hello");
    }

    public static void main(String ...args) {

        hello_world_thread_with_interface_within_same_class t = new hello_world_thread_with_interface_within_same_class();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while(true)
            System.out.println((i++) + " World");
    }

}
