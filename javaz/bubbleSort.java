package javaz;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {9,1,8,7,6,3,0};
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }

        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
