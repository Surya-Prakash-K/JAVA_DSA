package Programz;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,7,3,1,9,2};
        //            s     p e

        /*




         */
        sort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end --;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] =temp;
                start++;
                end--;
            }

        }

        System.out.println(Arrays.toString(arr));
        sort(arr,low,end);
        sort(arr,start,high);
    }
}
