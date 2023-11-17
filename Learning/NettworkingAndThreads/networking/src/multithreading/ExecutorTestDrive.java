package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread execution order is not guaranteed
 */
public class ExecutorTestDrive {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> System.out.println("top o' the stack"));

        System.out.println("back in main");
        executor.shutdown();
    }
}

class ThreadTestDrive{
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> System.out.println("top o' the stack"));
        myThread.start();
        System.out.println("back in main");
    }
}
