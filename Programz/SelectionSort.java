package Programz;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,0};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,0,last);
            System.out.println(maxIndex);
            swap(arr,maxIndex, last);
        }
        return arr;
    }
    static void swap(int[] arr,int start,int last){
       int temp =  arr[start];
       arr[start] = arr[last];
       arr[last] =  temp;
    }
    static int findMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
