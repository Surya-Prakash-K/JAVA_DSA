package javaz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {




    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[j]){
               j++;
               nums[j] = nums[i];
            }
        }

        return j+1;
    }

}
