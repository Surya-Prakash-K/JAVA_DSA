package javaz;

public class BookAllocation {
    public static void main(String[] args) {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println("Minimum number of pages: " + findPages(books, books.length, students));
    }
    public static int findPages(int[] books, int n, int m) {
        if (n < m) {
            return -1; // Not enough books for each student
        }

        int low = Integer.MIN_VALUE;
        int high = 0;

        // Calculate the search space
        for (int pages : books) {
            high += pages;
            low = Math.max(low, pages);
        }
        System.out.println("Low :"+low+ "High"+high);

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(books, n, m, mid)) {
                result = mid;
                high = mid - 1; // Try for a better minimum
            } else {
                low = mid + 1; // Increase pages per student
            }
        }

        return result;
    }

    private static boolean isPossible(int[] books, int n, int m, int maxPages) {
        int studentsRequired = 1;
        int currentSum = 0;

        for (int pages : books) {
            if (currentSum + pages > maxPages) {
                studentsRequired++;
                currentSum = pages;

                if (studentsRequired > m) {
                    return false;
                }
            } else {
                currentSum += pages;
            }
        }

        return true;
    }


}
