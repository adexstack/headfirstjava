import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

import static java.time.format.DateTimeFormatter.ofLocalizedTime;
import static java.time.format.FormatStyle.MEDIUM;

/**
 * ConcurrentModificationException is thrown by the reading thread when the List it is reading
 * is changed WHILE this thread is reading it
 */
public class ConcurrentReaders {
    public static void main(String[] args) {
        //List<Chat> chatHistory = new ArrayList<>();
        /**
         * Using CopyOnWriteArrayList instead on ArrayList prevents ConcurrentModificationException
         * This is a thread safe data structure to use when a List is being read a lot, but not changed very often
         */
        List<Chat> chatHistory = new CopyOnWriteArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> chatHistory.add(new Chat("Hi there!")));
            executor.execute(() -> System.out.println(chatHistory));
            executor.execute(() -> System.out.println(chatHistory));
        }
        executor.shutdown();
    }
}

final class Chat {
    private final String message;
    private final LocalDateTime timestamp;

    public Chat(String message) {
        this.message = message;
        timestamp = LocalDateTime.now();
    }

    public String toString() {
        String time = timestamp.format(ofLocalizedTime(MEDIUM));
        return time + " " + message;
    }
}