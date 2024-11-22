package javaz;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArray {
    public static void main(String[] args) {
//        System.out.println(negativeSubArr(new int[]{1 ,-2 ,4 ,-5, 1}));
        System.out.println(findNegativeSum(List.of(1 ,-2 ,4 ,-5, 1)));
    }

    public static int negativeSubArr(int[] arr) {
        int total_negative = 0;
        for (int i = 0; i < arr.length; i++) {
            int current_sum = 0;
            for (int j = i; j < arr.length; j++) {
                 current_sum += arr[j];
                if (current_sum < 0) {
                    total_negative++;
                }
            }
        }
        return total_negative;
    }

    public static long findNegativeSum(List<Integer> arr) {
        return  IntStream.range(0, arr.size())
                        .mapToObj(subArrayStart -> IntStream.range(subArrayStart, arr.size())
                        .mapToObj(subArrayEnd   -> arr.subList(subArrayStart, subArrayEnd + 1).stream().reduce(0, Integer::sum))
                        .filter(integer -> integer < 0)
                        .collect(Collectors.toList()))
                        .mapToLong(Collection::size)
                        .sum();
    }
}
