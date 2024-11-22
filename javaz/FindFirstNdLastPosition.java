package javaz;

import java.util.Arrays;

public class FindFirstNdLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstIndex(nums,target);
        result[1] = findLastIndex(nums,target);
        return  result;
    }


    private static int findFirstIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end =  nums.length - 1;

        while (start <= end){
            int mid =  start + (end - start) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private static int findLastIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end =  nums.length - 1;

        while (start <= end){
            int mid =  start + (end - start) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
