package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Asynchronous task that returns a result
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a long-running task
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Hello";
        });

        // Process the result when it becomes available
        CompletableFuture<String> processedFuture = future.thenApply(result -> result + " World!");

        // Handle exceptions
        processedFuture = processedFuture.exceptionally(ex -> "Failed: " + ex.getMessage());

        // Wait for the result and print it
        try {
            String finalResult = processedFuture.get();
            System.out.println(finalResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }


    
}
