package javaz;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10};
        int res = firstMissingPositive(arr);
        System.out.println(res);
    }
    /*

       -1,4,3,1
       -1,1,3,4
        1,-1,3,4
     */

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i]!= arr[correct_index]){
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }


        return arr.length + 1;
    }
}
