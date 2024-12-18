package javaz;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        int res = splitArray(nums,k);
        System.out.println(res);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

}
