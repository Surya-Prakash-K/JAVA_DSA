package Test;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is starting.");
            try {
                Thread.sleep(2000); // Simulate some work with a 2-second sleep
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1 has finished.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is starting.");
            try {
                Thread.sleep(1000); // Simulate some work with a 1-second sleep
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2 has finished.");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Main thread waits for thread1 to complete
            thread2.join(); // Main thread waits for thread2 to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads have finished. Main thread resumes.");
    }
}
