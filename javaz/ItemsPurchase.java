package javaz;

import java.util.PriorityQueue;

public class ItemsPurchase {

    public static int findMinimumPrice(int[] price, int m) {
        // Priority queue (max heap) to store potential savings
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int totalPrice = 0;

        // Calculate the total price and add potential savings to the heap
        for (int p : price) {
            totalPrice += p;
            int currentPrice = p;
            while (currentPrice > 0) {
                int nextPrice = currentPrice / 2;  // Apply coupon
                maxHeap.add(currentPrice - nextPrice); // Save the difference
                currentPrice = nextPrice;
            }
        }
        System.out.println(maxHeap);

        // Use up to m coupons to maximize savings
        for (int i = 0; i < m && !maxHeap.isEmpty(); i++) {
            totalPrice -= maxHeap.poll(); // Reduce the total cost by the max savings
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        int[] price = {1, 2, 3};
        int m = 1;
        System.out.println(findMinimumPrice(price, m)); // Output: 4
    }
}