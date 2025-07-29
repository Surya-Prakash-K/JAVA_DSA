package Programz;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,33,4,10,22,30,33};
        System.out.println(findIndex(arr,33,0,new ArrayList<>()));
    }

    static List<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndex(arr,target,index+1,list);
    }



}
