package Programz;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,7,4,2,1,5,3,9,11,8,10};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
         while (i < arr.length){
             int correct_index = arr[i] - 1;
             if(arr[i] != arr[correct_index]){
                 int temp = arr[i];
                 arr[i] = arr[correct_index];
                 arr[correct_index] = temp;
             } else {
                 i++;
             }
         }
    }
}
