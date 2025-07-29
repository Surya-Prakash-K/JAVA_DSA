package Programz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequenceList {
    

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = findSubsetDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }    
    }

     static List<List<Integer>> findSubset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : arr){
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<>(result.get(i));
                list.add(num);
                result.add(list);
            }
        }
        return result;
     }


     static List<List<Integer>> findSubsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int start = 0;
        int end  = 0;
         for (int i = 0; i < arr.length ; i++) {
             if(i > 0 && arr[i] == arr[i-1]){
                 start = end+1;
             }
             int n = result.size();
             end = n - 1;
             for (int j = start; j < n; j++) {
                 List<Integer> list = new ArrayList<>(result.get(j));
                 list.add(arr[i]);
                 result.add(list);
             }
         }
         return result;
     }
}
