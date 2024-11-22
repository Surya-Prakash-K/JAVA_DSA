package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,23,34,44,56,66,67,88,99,100,1000};
        int res  = binarySearch(arr,88);
        System.out.println(res);
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) /2 ;
            if (arr[mid] == target){
              return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
