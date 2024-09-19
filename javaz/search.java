package javaz;

public class search {
    public static void main(String[] args) {

        int[] nums = {1,3,4,6,7,9,11,13};
        int target = 13;
        int result = linearSearch(nums,target);
        int result1 = binarySearch(nums,target);

        System.out.println("Value found in the index :"+result1);
    }

    public static int linearSearch(int[] arr, int target){

        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        //1,3,4,6,7,9,11,13
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
