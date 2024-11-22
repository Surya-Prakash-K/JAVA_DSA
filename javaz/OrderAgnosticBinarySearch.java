package javaz;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,34,44,56,66,67,88,99,100,1000};
        int[] arr2 = {34,23,11,10,9,8,5,4,2,1};
        int res  = binarySearch(arr2,1);
        System.out.println(res);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
