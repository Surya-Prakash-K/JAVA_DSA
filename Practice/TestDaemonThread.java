package Practice;

class DaemonThreadExample extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                System.out.println("Daemon thread is running in background...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestDaemonThread {
    public static void main(String[] args) {
        DaemonThreadExample daemonThread = new DaemonThreadExample();
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        // Main thread continues to run some task
        try {
            Thread.sleep(2000); // Main thread sleeps for 2 seconds
            System.out.println("Main thread is finishing...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Once the main thread finishes, the JVM exits and the daemon thread terminates
    }
}
