package javaz;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationstoMakeArrayEmpty {
    public static void main(String[] args) {
        int[] val ={2,3,3,2,2,4,2,3,4};
        int[] arr = {6,4,7};
        int[] result ={11,11,11,11,19,11,11,11,11,11,19,11,11,11,11,11,19};
//                {3,14,3,14,3,14,14,3,3,14,14,14,3,14,14,3,14,14,14,3};
//                {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        int res = minOperations(val);
        int re = minOperations(arr);
        int resul = minOperations(result);
        int results = minOperations2(result);

        System.out.println(results);
    }

    public static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], count);
            }
        }

        int operationCount = 0;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            int frequency = val.getValue();
            int counter = 0;
            if(frequency == 1) return -1;
            if (frequency % 3 == 0) {
                counter = frequency / 3;
                operationCount += counter;
            }  else if (frequency % 3 == 1) {
                counter = (frequency-1) / 3 + 1;
                operationCount += counter;
            } else {
                counter = frequency / 3 + 1;
                operationCount += counter;
            }
        }
        return operationCount;
    }

    public static int minOperations2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], count);
            }
        }

        int operationCount = 0;
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            int frequency = val.getValue();
            if(frequency == 1) return -1;
            operationCount+= frequency/3;
            if(frequency%3!=0){
                operationCount++;
            }
        }
        return operationCount;
    }
}
