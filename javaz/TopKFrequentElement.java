package javaz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1,2}; int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int j = 0;
        while (j < nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j],1);
                j++;
            } else {
                map.put(nums[j], map.get(nums[j])+1);
                j++;
            }
        }

        int f;
        if (k <= 0 || k >= nums.length) {
            f = 1;
        } else {
            f = k;
        }

        List<Integer> list = map.entrySet().stream().filter(e -> e.getValue() >= f).map(Map.Entry::getKey).toList();

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]  =  list.get(i);
        }
        return arr;
    }
}
