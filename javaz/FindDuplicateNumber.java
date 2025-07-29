package javaz;


public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(arr.length);
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        if(arr.length == 1){return 0;}
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct_index = arr[i] - 1;
                if (arr[i] != arr[correct_index]) {
                    swap(arr, i, correct_index);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public int sort(int[] arr){

        return -1;
    }

}
