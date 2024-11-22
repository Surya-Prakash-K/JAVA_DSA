package javaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(List.of(-59, -36, -13, 1 ,-53, -92, -2, -96, -54, 75)));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int min_abs_difference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() -1 ; i++) {
            int curr_diff = Math.abs(arr.get(i)- arr.get(i+1));
            min_abs_difference = Math.min(min_abs_difference,curr_diff);
        }
        return min_abs_difference;

    }
}
