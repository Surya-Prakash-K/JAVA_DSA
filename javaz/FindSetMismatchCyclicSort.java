package javaz;

import java.util.Arrays;

public class FindSetMismatchCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i]!= arr[correct_index]){
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{};
    }
}
