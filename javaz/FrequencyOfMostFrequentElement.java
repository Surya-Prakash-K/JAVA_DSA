package javaz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfMostFrequentElement {

    public static void main(String[] args) {
//        int[] nums = {1,1,1,1,5,6,7,7}; int k = 9;
        int[] nums = {
                9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,
                9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,
                9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,
                9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,
                9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,
                9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,
                9975,9954,9932,9964,9972,9935,9946,9966
        };
        int k = 3056;

        int result = maxFrequency(nums,k);
        System.out.println(result);
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put((long)nums[i], map.get(nums[i]) + 1);
            else
                map.put((long)nums[i], 1);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= max; j++) {
                long sum = nums[i] + j;
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);

                }
            }

        }
        int maxFrequency = Integer.MIN_VALUE;
        for(Map.Entry<Long,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
            }
        }

        return maxFrequency;
    }

}
