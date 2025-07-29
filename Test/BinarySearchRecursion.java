package Test;

import java.util.List;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int res =  search(arr,6,0,arr.length-1);
        System.out.println(res);

//        List<Integer> list = List.of(2,4,5,6);
//        list.forEach(e -> System.out.println(e+""+e+1));
    }

    static int search(int[] arr, int target, int start, int end){
      int mid =  start + (end - start) / 2;
      if(arr[mid] == target){
          return mid;
      }

      if(target < arr[mid]){
          return search(arr, target,start,mid-1);
      }
        return search(arr,target,mid+1,end);
    }
}
