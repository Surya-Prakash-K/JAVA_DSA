package javaz;

public class PositionOfElementInfiniteSortedArray {
    public static void main(String[] args) {
      int[] arr = {1,2,10,11,22,40,50,77,99,100,120};
        int index = findTarget(arr, 10);
        System.out.println(index);

    }

    private static int findTarget(int[] arr, int target) {
        int start = 0;
        int end  =  1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

     static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end){
            int mid = start + (end - start) /2 ;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
