package Programz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
//        System.out.println(find(List.of(12,34,23,100)));
        System.out.println(second(new int[]{9,1,4,6,7,8}));
    }

    static int find(List<Integer> list){
        return list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
    }

    static int second(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
