package javaz;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,5,6,7},
                {4,8,9},
                {1,2,10,11}
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }
    
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }
}
