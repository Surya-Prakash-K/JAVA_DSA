package Programz;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,4,9,0};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                int currentJ = arr[j];
                int currentJ_1 = arr[j-1];
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);

                } else {
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int start,int end){
        int temp =  arr[start];
        arr[start] = arr[end];
        arr[end] =  temp;
    }

}
