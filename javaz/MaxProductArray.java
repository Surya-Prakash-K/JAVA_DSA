package javaz;

public class MaxProductArray {
    public static void main(String[] args) {
        int[] arr = {-2,0,-1};
        System.out.println(maxProduct(arr));
    }


    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        for (int j = 1; i < nums.length; i++) {
            if(j < nums.length){
                int currentMax = nums[j]* nums[j-1];
                max = Math.max(max,currentMax);
                i++;
            }

        }
        return max;
    }

}
