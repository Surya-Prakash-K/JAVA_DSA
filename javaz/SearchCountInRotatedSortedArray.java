package javaz;

public class SearchCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
        int res = findCount(arr);
        System.out.println(res);
    }

    private static int findCount(int[] arr) {
      int pivot = findPivot(arr);

      return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {


            }
        }
        return -1;
    }
}
