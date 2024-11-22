package javaz;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int res = findMissingNumber(arr);
        System.out.println(res);
    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j){
                return j;
            }
        }
        return arr.length;
    }
}
