package javaz;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(new List[]{findMissingNumber(arr)}));
    }

    public static List<Integer> findMissingNumber(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
            int correct_index = arr[i]- 1;
            if(arr[i]!= arr[correct_index]){
                swap(arr,i,correct_index);
            } else {
                i++;
            }
        }

        return Collections.emptyList();
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
