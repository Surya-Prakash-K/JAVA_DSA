package javaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MinIndexSumOfTwoList {
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
//        String[] result = findRestaurant(list1,list2);
        String[] res = findRestaurants(list1,list2);
        for (String s : res) {
            System.out.println(s);
        }
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<list1.length;i++) {
            for (int j=0;j<list2.length;j++) {
                int sumOfIndex = 0;
                if(list1[i].equals(list2[j])){
                    sumOfIndex = i+j;
                    map.put(list1[i],sumOfIndex);
                    break;
                }
            }
        }

        int minValue = Integer.MAX_VALUE;
        for (int value : map.values()) {
            if (value < minValue) {
                minValue = value;
            }
        }
        List<String> list = new ArrayList<>();

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            int index = entry.getValue();
            if(index == minValue){
                list.add(entry.getKey());
            }
        }
        int k =0;
        String[] result = new String[list.size()];
        for(String str : list){
            result[k] = str;
            k++;
        }

        return result;
    }

    public static String[] findRestaurants(String[] list1, String[] list2) {

        List<String> list = new ArrayList<>();
        for (int i=0;i<list1.length;i++) {
            list.add(list1[i]);
        }

        List<String> result = new ArrayList<>();
        result.add("random");

        int min = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(list.contains(list2[i])){
               int index = list.indexOf(list2[i]) + i;
               if(min > index){
                   result.clear();
                   result.add(list2[i]);
                   min = index;
               } else if (min == index) {
                   result.add(list2[i]);
                   min = index;
               }

            }
        }
        int k=0;
        String[] arr = new String[result.size()];
        for(String str : result){
            arr[k] = str;
            k++;
        }
        return arr;
    }
}
