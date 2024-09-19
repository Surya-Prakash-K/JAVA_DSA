package javaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatedFromArray {

    public static void main(String[] args) {
        int[] nums = { 11,12,70,37,30,63,49,12,32,63,12,51,64,45,8,67,34,1,17,67,55,23,11,42,65,73,41,67,67,53,29,28,49,36,38,34,21,55,14,55,33,33,23,48,14,14,1,41,4,10,37,16,61,73,18,24,73,51,57,23,32,66,7,63,61,24,18,9,67,53,47,17,72,69 };
        List<Integer> result = duplicates(nums);
        System.out.println(result);
    }
    public static ArrayList<Integer> duplicates(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                if (!map.containsKey(arr[i+1])) {
                    map.put(arr[i + 1], 1);
                }
            }
        }
        ArrayList<Integer> list =  new ArrayList<>(map.keySet());
        if(map.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}
