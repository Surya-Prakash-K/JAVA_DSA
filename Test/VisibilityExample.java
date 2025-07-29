package Test;

public class VisibilityExample {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (running) {
                System.out.println("hiii");
            }
            System.out.println("Thread 1 stopped.");
        });

        Thread thread2 = new Thread(() -> {
            // Simulate some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            running = false;
            System.out.println("Thread 2 updated running to false.");
        });

        thread1.start();
        thread2.start();
    }
}
