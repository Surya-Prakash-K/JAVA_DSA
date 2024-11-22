package javaz;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5,6};
        int target = 2;
        System.out.println(search(arr,target));
    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if (pivot == -1) {
            return findTarget(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] > target) {
            return findTarget(arr, target, pivot + 1, arr.length - 1);
        }
        return findTarget(arr, target, 0, pivot - 1);
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int findTarget(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid  = start + (end - start) / 2;
            if(target == arr[mid]) return mid;
            if (target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
