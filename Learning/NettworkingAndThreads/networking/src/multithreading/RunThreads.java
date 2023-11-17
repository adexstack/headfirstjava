package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThreads {
    public static void main(String[] args) {
        ExecutorService threadpool = Executors.newFixedThreadPool(2);
        threadpool.execute(() -> runJob("Job 1"));
        threadpool.execute(() -> runJob("Job 2"));
        threadpool.shutdown();
    }

    private static void runJob(String jobName) {
        for (int i = 0; i < 25 ; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(jobName + " is running on " + threadName);
        }
    }
}
